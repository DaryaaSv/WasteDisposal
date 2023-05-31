package lt.viko.eif.p121e.wastedisposal.Models.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.BranchTruck;

@Dao
public interface BranchTruckDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(BranchTruck branchTruck);

    @Update
    void update(BranchTruck branchTruck);

    @Delete
    void delete(BranchTruck branchTruck);

    @Query("SELECT * FROM tbl_branch_trucks")
    List<BranchTruck> getAllBranchTrucks();

    @Query("SELECT * FROM tbl_branch_trucks WHERE branch_truck_id = :branchTruckId")
    BranchTruck getBranchTruckById(int branchTruckId);
}