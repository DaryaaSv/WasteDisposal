package lt.viko.eif.p121e.wastedisposal.Util.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.BranchEmployee;

@Dao
public interface BranchEmployeeDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(BranchEmployee branchEmployee);

    @Update
    void update(BranchEmployee branchEmployee);

    @Delete
    void delete(BranchEmployee branchEmployee);

    @Query("SELECT * FROM tbl_branch_containers")
    List<BranchEmployee> getAllBranchEmployees();

    @Query("SELECT * FROM tbl_branch_containers WHERE branch_employee_id = :branchEmployeeId")
    BranchEmployee getBranchEmployeeById(int branchEmployeeId);
}
