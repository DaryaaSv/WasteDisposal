package lt.viko.eif.p121e.wastedisposal.Util.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.BranchCustomerMilestone;

@Dao
public interface BranchCustomerMilestoneDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(BranchCustomerMilestone branchCustomerMilestone);

    @Update
    void update(BranchCustomerMilestone branchCustomerMilestone);

    @Delete
    void delete(BranchCustomerMilestone branchCustomerMilestone);

    @Query("SELECT * FROM tbl_branch_customer_milestone")
    List<BranchCustomerMilestone> getAllBranchCustomerMilestones();

    @Query("SELECT * FROM tbl_branch_customer_milestone WHERE branch_customer_milestone_id = :branchCustomerMilestoneId")
    BranchCustomerMilestone getBranchCustomerMilestoneById(int branchCustomerMilestoneId);
}