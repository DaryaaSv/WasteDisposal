import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.List;

public class DatabaseHandler {

    private static SessionFactory sessionFactory;

    public static void initializeSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            configuration.setProperty("hibernate.connection.driver_class", "com.microsoft.sqlserver.jdbc.SQLServerDriver");
            configuration.setProperty("hibernate.connection.url", "jdbc:sqlserver://your_server_address:port;databaseName=your_database_name;");
            configuration.setProperty("hibernate.connection.username", "your_username");
            configuration.setProperty("hibernate.connection.password", "your_password");
            sessionFactory = configuration.buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void shutdownSessionFactory() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

    public static <T> void saveEntity(T entity) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.saveOrUpdate(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public static <T> void deleteEntity(T entity) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.delete(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public static <T> List<T> getAllEntities(Class<T> entityType) {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            return session.createQuery("FROM " + entityType.getSimpleName(), entityType).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public static <T> T getEntityByValue(Class<T> entityType, String fieldName, Object value) {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            String queryString = "FROM " + entityType.getSimpleName() + " WHERE " + fieldName + " = :value";
            Query<T> query = session.createQuery(queryString, entityType);
            query.setParameter("value", value);
            return query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public static <T> void updateEntityByValue(Class<T> entityType, String fieldName, Object value, String updateFieldName, Object updateValue) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            String queryString = "UPDATE " + entityType.getSimpleName() + " SET " + updateFieldName + " = :updateValue WHERE " + fieldName + " = :value";
            Query<T> query = session.createQuery(queryString, entityType);
            query.setParameter("updateValue", updateValue);
            query.setParameter("value", value);
            query.executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}