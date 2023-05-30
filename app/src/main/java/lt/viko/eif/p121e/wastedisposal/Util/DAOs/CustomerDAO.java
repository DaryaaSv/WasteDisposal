package lt.viko.eif.p121e.wastedisposal.Util.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.Customer;

@Dao
public interface CustomerDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Customer customer);

    @Update
    void update(Customer customer);

    @Delete
    void delete(Customer customer);

    @Query("SELECT * FROM tbl_customers")
    List<Customer> getAllCustomers();

    @Query("SELECT * FROM tbl_customers WHERE customer_id = :customerId")
    Customer getCustomerById(int customerId);

    @Query("SELECT * FROM tbl_customers WHERE username = :username")
    Customer getCustomerByUsername(String username);

    @Query("SELECT * FROM tbl_customers WHERE address_id = :addressId")
    List<Customer> getCustomersByAddressId(int addressId);
}