package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_phones", foreignKeys = {
        @ForeignKey(entity = BranchAddress.class, parentColumns = "branch_id", childColumns = "branch_id")
})
public class Phone {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "phone_id")
    private int id;

    @ColumnInfo(name = "phone_number")
    private String phoneNumber;

    @ColumnInfo(name = "branch_id")
    private int branchId;

    public Phone(String phoneNumber, int branchId) {
        this.phoneNumber = phoneNumber;
        this.branchId = branchId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }
}
