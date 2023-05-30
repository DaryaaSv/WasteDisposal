package lt.viko.eif.p121e.wastedisposal.Util.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.Administrator;

@Dao
public interface AdministratorDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Administrator administrator);

    @Update
    void update(Administrator administrator);

    @Delete
    void delete(Administrator administrator);

    @Query("SELECT * FROM tbl_administrators")
    List<Administrator> getAllAdministrators();

    @Query("SELECT * FROM tbl_administrators WHERE username = :username")
    Administrator getAdministratorByUsername(String username);
}