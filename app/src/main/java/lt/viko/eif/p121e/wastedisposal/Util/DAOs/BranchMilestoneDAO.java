package lt.viko.eif.p121e.wastedisposal.Util.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.BranchMilestone;

@Dao
public interface BranchMilestoneDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(BranchMilestone branchMilestone);

    @Update
    void update(BranchMilestone branchMilestone);

    @Delete
    void delete(BranchMilestone branchMilestone);

    @Query("SELECT * FROM tbl_branch_milestone")
    List<BranchMilestone> getAllBranchMilestones();

    @Query("SELECT * FROM tbl_branch_milestone WHERE branch_milestone_id = :branchMilestoneId")
    BranchMilestone getBranchMilestoneById(int branchMilestoneId);
}