package lt.viko.eif.p121e.wastedisposal.Models.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.Currency;

@Dao
public interface CurrencyDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Currency currency);

    @Update
    void update(Currency currency);

    @Delete
    void delete(Currency currency);

    @Query("SELECT * FROM tbl_currencies")
    List<Currency> getAllCurrencies();

    @Query("SELECT * FROM tbl_currencies WHERE currency_id = :currencyId")
    Currency getCurrencyById(int currencyId);
}