package lt.viko.eif.p121e.wastedisposal.Util.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.Container;

@Dao
public interface ContainerDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Container container);

    @Update
    void update(Container container);

    @Delete
    void delete(Container container);

    @Query("SELECT * FROM tbl_containers")
    List<Container> getAllContainers();

    @Query("SELECT * FROM tbl_containers WHERE container_id = :containerId")
    Container getContainerById(int containerId);
}