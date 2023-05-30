package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_prices")
public class Price {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "price_id")
    private int id;
    @ColumnInfo(name = "currency_name")
    private String currencyName;
    @ColumnInfo(name = "price")
    private float price;

    public Price(String currencyName, float price) {
        this.currencyName = currencyName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
