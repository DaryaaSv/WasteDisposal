package lt.viko.eif.p121e.wastedisposal.Models1;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_currencies")
public class Currency {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "currency_id")
    private int id;
    @ColumnInfo(name = "currency_name")
    private String currencyName;
    @ColumnInfo(name = "currency_code")
    private String currencyCode;
    @ColumnInfo(name = "price")
    private float price;

    public Currency(String currencyName, String currencyCode, float price) {
        this.currencyName = currencyName;
        this.currencyCode = currencyCode;
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

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
