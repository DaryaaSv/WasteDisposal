package lt.viko.eif.p121e.wastedisposal.Models.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.Truck;

@Dao
public interface TruckDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTruck(Truck truck);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTrucks(List<Truck> trucks);

    @Update
    void updateTruck(Truck truck);

    @Delete
    void deleteTruck(Truck truck);

    @Query("SELECT * FROM tbl_trucks")
    List<Truck> getAllTrucks();

    @Query("SELECT * FROM tbl_trucks WHERE truck_id = :truckId")
    Truck getTruckById(int truckId);

}