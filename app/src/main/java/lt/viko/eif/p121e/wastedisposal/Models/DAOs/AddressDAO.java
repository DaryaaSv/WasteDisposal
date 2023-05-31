package lt.viko.eif.p121e.wastedisposal.Models.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.Address;

@Dao
public interface AddressDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Address address);

    @Update
    void update(Address address);

    @Delete
    void delete(Address address);

    @Query("SELECT * FROM tbl_addresses")
    List<Address> getAllAddresses();
    @Query("SELECT * FROM tbl_addresses WHERE address_id = :address_id")
    Address getAddressById(int address_id);

    @Query("SELECT * FROM tbl_addresses WHERE country = :country AND region = :region AND city = :city")
    Address getAddressByProperties(String country, String region, String city);

}
