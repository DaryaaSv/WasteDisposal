package lt.viko.eif.p121e.wastedisposal.Util.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.BranchContainer;

@Dao
public interface BranchContainerDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(BranchContainer branchContainer);

    @Update
    void update(BranchContainer branchContainer);

    @Delete
    void delete(BranchContainer branchContainer);

    @Query("SELECT * FROM tbl_branch_containers")
    List<BranchContainer> getAllBranchContainers();

    @Query("SELECT * FROM tbl_branch_containers WHERE branch_container_id = :branchContainerId")
    BranchContainer getBranchContainerById(int branchContainerId);
}