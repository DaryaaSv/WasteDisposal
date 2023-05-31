package lt.viko.eif.p121e.wastedisposal.Models.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.OrderType;

@Dao
public interface OrderTypeDAO {
    @Query("SELECT * FROM tbl_order_type")
    List<OrderType> getAllOrderTypes();

    @Query("SELECT * FROM tbl_order_type WHERE order_type_id = :id")
    OrderType getOrderTypeById(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertOrderType(OrderType orderType);

    @Update
    void updateOrderType(OrderType orderType);

    @Delete
    void deleteOrderType(OrderType orderType);

    @Query("DELETE FROM tbl_order_type")
    void deleteAllOrderTypes();
}