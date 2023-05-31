package lt.viko.eif.p121e.wastedisposal.Models.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.CustomerMilestone;

@Dao
public interface CustomerMilestoneDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(CustomerMilestone customerMilestone);

    @Update
    void update(CustomerMilestone customerMilestone);

    @Delete
    void delete(CustomerMilestone customerMilestone);

    @Query("SELECT * FROM tbl_customers_milestones")
    List<CustomerMilestone> getAllCustomerMilestones();

    @Query("SELECT * FROM tbl_customers_milestones WHERE customer_milestone_id = :id")
    CustomerMilestone getCustomerMilestoneById(int id);
}