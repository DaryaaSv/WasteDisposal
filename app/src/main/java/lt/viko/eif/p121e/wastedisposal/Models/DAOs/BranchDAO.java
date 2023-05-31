package lt.viko.eif.p121e.wastedisposal.Models.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.Branch;

@Dao
public interface BranchDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Branch branch);

    @Update
    void update(Branch branch);

    @Delete
    void delete(Branch branch);

    @Query("SELECT * FROM tbl_branches")
    List<Branch> getAllBranches();

    @Query("SELECT * FROM tbl_branches WHERE branch_id = :branchId")
    Branch getBranchById(int branchId);
}