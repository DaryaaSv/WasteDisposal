package lt.viko.eif.p121e.wastedisposal.Util.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.MaterialType;

@Dao
public interface MaterialTypeDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(MaterialType materialType);

    @Update
    void update(MaterialType materialType);

    @Delete
    void delete(MaterialType materialType);

    @Query("SELECT * FROM tbl_material_types")
    List<MaterialType> getAllMaterialTypes();

    @Query("SELECT * FROM tbl_material_types WHERE material_type_id = :id")
    MaterialType getMaterialTypeById(int id);
}