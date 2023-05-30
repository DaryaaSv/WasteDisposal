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
        @ForeignKey(entity = Currency.class,
                parentColumns = "currency_id",
                childColumns = "currency_id",
                onDelete = ForeignKey.CASCADE)
})
public class Company {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "company_id")
    private int id;
    @ColumnInfo(name = "administrator_id")
    private int administratorId;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "currency_id")
    private int currencyId;

    public Company(int administratorId, String name, int currencyId) {
        this.administratorId = administratorId;
        this.name = name;
        this.currencyId = currencyId;
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

    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
