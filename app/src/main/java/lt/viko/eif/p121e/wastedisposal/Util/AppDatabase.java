package lt.viko.eif.p121e.wastedisposal.Util;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import lt.viko.eif.p121e.wastedisposal.Models.*;
import lt.viko.eif.p121e.wastedisposal.Models.DAOs.*;

@Database(entities = {Address.class, Administrator.class, Branch.class,
        BranchBuyingIn.class, BranchContainer.class, BranchCustomerMilestone.class,
        BranchEmployee.class, BranchMilestone.class, BranchTruck.class, BuyingIn.class,
        Comment.class, Company.class, Container.class, Currency.class, Customer.class,
        CustomerComment.class, CustomerMilestone.class, Email.class, Employee.class, Material.class,
        MaterialType.class, Milestone.class, Order.class, OrderType.class, Phone.class,
        Recycling.class, Service.class, Truck.class
        }, version = 2)
public abstract class AppDatabase extends RoomDatabase {
    public abstract AddressDAO addressDAO();
    public abstract AdministratorDAO administratorDAO();
    public abstract BranchDAO branchDAO();
    public abstract BranchBuyingInDAO branchBuyingInDAO();
    public abstract BranchContainerDAO branchContainerDAO();
    public abstract BranchCustomerMilestoneDAO branchCustomerMilestoneDAO();
    public abstract BranchEmployeeDAO branchEmployeeDAO();
    public abstract BranchMilestoneDAO branchMilestoneDAO();
    public abstract BranchTruckDAO branchTruckDAO();
    public abstract BuyingInDAO buyingInDAO();
    public abstract CommentDAO commentDAO();
    public abstract CompanyDAO companyDAO();
    public abstract ContainerDAO containerDAO();
    public abstract CurrencyDAO currencyDAO();
    public abstract CustomerDAO customerDAO();
    public abstract CustomerCommentDAO commentCustomerDAO();
    public abstract CustomerMilestoneDAO customerMilestoneDAO();
    public abstract EmailDAO emailDAO();
    public abstract EmployeeDAO employeeDAO();
    public abstract MaterialDAO materialDAO();
    public abstract MaterialTypeDAO materialTypeDAO();
    public abstract MilestoneDAO milestoneDAO();
    public abstract OrderDAO orderDAO();
    public abstract OrderTypeDAO orderTypeDAO();
    public abstract PhoneDAO phoneDAO();
    public abstract RecyclingDAO recyclingDAO();
    public abstract ServiceDAO serviceDAO();
    public abstract TruckDAO truckDAO();
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
