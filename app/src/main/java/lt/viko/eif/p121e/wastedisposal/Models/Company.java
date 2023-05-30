package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_companies", foreignKeys = {
        @ForeignKey(entity = Administrator.class,
                parentColumns = "administrator_id",
                childColumns = "administrator_id",
                onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = Price.class,
                parentColumns = "price_id",
                childColumns = "price_id",
                onDelete = ForeignKey.CASCADE)
})
public class Company {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "company_id")
    private int id;
    @ColumnInfo(name = "administrator_id")
    private int administratorId;
    private String name;
    @ColumnInfo(name = "price_id")
    private int priceId;

    public Company(int administratorId, String name, int priceId) {
        this.administratorId = administratorId;
        this.name = name;
        this.priceId = priceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(int administratorId) {
        this.administratorId = administratorId;
    }

    public int getPriceId() {
        return priceId;
    }

    public void setPriceId(int priceId) {
        this.priceId = priceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
