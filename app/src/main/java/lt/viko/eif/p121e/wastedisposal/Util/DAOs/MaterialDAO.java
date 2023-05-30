package lt.viko.eif.p121e.wastedisposal.Util.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.Material;

@Dao
public interface MaterialDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Material material);

    @Update
    void update(Material material);

    @Delete
    void delete(Material material);

    @Query("SELECT * FROM tbl_materials")
    List<Material> getAllMaterials();

    @Query("SELECT * FROM tbl_materials WHERE material_id = :id")
    Material getMaterialById(int id);
}