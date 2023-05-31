package lt.viko.eif.p121e.wastedisposal.Models.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.Phone;

@Dao
public interface PhoneDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertPhone(Phone phone);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertPhones(List<Phone> phones);

    @Update
    void updatePhone(Phone phone);

    @Delete
    void deletePhone(Phone phone);

    @Query("SELECT * FROM tbl_phones")
    List<Phone> getAllPhones();

    @Query("SELECT * FROM tbl_phones WHERE phone_id = :phoneId")
    Phone getPhoneById(int phoneId);

    @Query("SELECT * FROM tbl_phones WHERE branch_id = :branchId")
    List<Phone> getPhonesByBranchId(int branchId);
}