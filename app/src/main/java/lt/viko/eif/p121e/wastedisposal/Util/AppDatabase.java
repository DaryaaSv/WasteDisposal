package lt.viko.eif.p121e.wastedisposal.Util;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import lt.viko.eif.p121e.wastedisposal.Models.*;
import lt.viko.eif.p121e.wastedisposal.Util.DAOs.AddressDAO;
import lt.viko.eif.p121e.wastedisposal.Util.DAOs.AdministratorDAO;
import lt.viko.eif.p121e.wastedisposal.Util.DAOs.CustomerDAO;

@Database(entities = {Address.class, Administrator.class, Branch.class,
        BranchBuyingIn.class, BranchContainer.class, BranchCustomerMilestone.class,
        BranchEmployee.class, BranchMilestone.class, BranchTruck.class, BuyingIn.class,
        Comment.class, Company.class, Container.class, Currency.class, Customer.class,
        CustomerComment.class, CustomerMilestone.class, Email.class, Employee.class, Material.class,
        MaterialType.class, Milestone.class, Order.class, OrderType.class, Phone.class,
        Recycling.class, Service.class, Truck.class
        }, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract CustomerDAO customerDao();
    public abstract AddressDAO addressDAO();
    public abstract AdministratorDAO administratorDAO();

    private static final String DB_NAME = "app_database";
    private static AppDatabase instance;

    public static synchronized AppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, DB_NAME)
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
