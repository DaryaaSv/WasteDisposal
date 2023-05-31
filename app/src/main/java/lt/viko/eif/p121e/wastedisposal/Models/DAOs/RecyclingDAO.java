package lt.viko.eif.p121e.wastedisposal.Models.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.Recycling;

@Dao
public interface RecyclingDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertRecycling(Recycling recycling);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertRecyclings(List<Recycling> recyclings);

    @Update
    void updateRecycling(Recycling recycling);

    @Delete
    void deleteRecycling(Recycling recycling);

    @Query("SELECT * FROM tbl_recycling")
    List<Recycling> getAllRecyclings();

    @Query("SELECT * FROM tbl_recycling WHERE recycling_id = :recyclingId")
    Recycling getRecyclingById(int recyclingId);

    @Query("SELECT * FROM tbl_recycling WHERE material_id = :materialId")
    List<Recycling> getRecyclingsByMaterialId(int materialId);

    @Query("SELECT * FROM tbl_recycling WHERE material_type_id = :materialTypeId")
    List<Recycling> getRecyclingsByMaterialTypeId(int materialTypeId);
}