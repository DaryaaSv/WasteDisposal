package lt.viko.eif.p121e.wastedisposal.Models.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.Service;
@Dao
public interface ServiceDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertService(Service service);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertServices(List<Service> services);

    @Update
    void updateService(Service service);

    @Delete
    void deleteService(Service service);

    @Query("SELECT * FROM tbl_service")
    List<Service> getAllServices();

    @Query("SELECT * FROM tbl_service WHERE service_id = :serviceId")
    Service getServiceById(int serviceId);

}