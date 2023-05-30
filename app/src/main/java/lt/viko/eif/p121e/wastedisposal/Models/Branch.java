package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_branches", foreignKeys = {
        @ForeignKey(entity = Company.class,
                parentColumns = "company_id", childColumns = "company_id", onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = Address.class,
                parentColumns = "address_id", childColumns = "address_id", onDelete = ForeignKey.CASCADE),
})
public class Branch {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "branch_id")
    private int id;
    @ColumnInfo(name = "company_id")
    private int companyId;
    @ColumnInfo(name = "work_time")
    private String workTime;
    @ColumnInfo(name = "address_id")
    private int addressId;

    public Branch(int companyId, String workTime, int addressId) {
        this.companyId = companyId;
        this.workTime = workTime;
        this.addressId = addressId;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
}
