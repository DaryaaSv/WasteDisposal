package lt.viko.eif.p121e.wastedisposal.Models.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.BuyingIn;

@Dao
public interface BuyingInDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(BuyingIn buyingIn);

    @Update
    void update(BuyingIn buyingIn);

    @Delete
    void delete(BuyingIn buyingIn);

    @Query("SELECT * FROM tbl_buying_in")
    List<BuyingIn> getAllBuyingIns();

    @Query("SELECT * FROM tbl_buying_in WHERE buying_in_id = :buyingInId")
    BuyingIn getBuyingInById(int buyingInId);
}