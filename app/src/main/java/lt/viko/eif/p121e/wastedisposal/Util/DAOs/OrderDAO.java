package lt.viko.eif.p121e.wastedisposal.Util.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.Order;

@Dao
public interface OrderDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Order order);

    @Update
    void update(Order order);

    @Delete
    void delete(Order order);

    @Query("SELECT * FROM tbl_branch_containers WHERE order_id = :orderId")
    Order getOrderById(int orderId);

    @Query("SELECT * FROM tbl_branch_containers")
    List<Order> getAllOrders();

    @Query("SELECT * FROM tbl_branch_containers WHERE is_done = 1")
    List<Order> getCompletedOrders();

    @Query("SELECT * FROM tbl_branch_containers WHERE branch_id = :branchId")
    List<Order> getOrdersByBranchId(int branchId);

    @Query("SELECT * FROM tbl_branch_containers WHERE customer_id = :customerId")
    List<Order> getOrdersByCustomerId(String customerId);

    @Query("SELECT COUNT(*) FROM tbl_branch_containers")
    int getOrderCount();

    @Query("DELETE FROM tbl_branch_containers")
    void deleteAllOrders();
}