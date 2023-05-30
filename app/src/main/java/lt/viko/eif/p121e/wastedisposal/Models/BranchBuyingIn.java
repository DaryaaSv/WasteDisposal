package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_branch_containers", foreignKeys = {
        @ForeignKey(entity = Branch.class, parentColumns = "branch_id",
                childColumns = "branch_id", onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = BuyingIn.class, parentColumns = "buying_in_id",
                childColumns = "buying_in_id", onDelete = ForeignKey.CASCADE)
})
public class BranchBuyingIn {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "branch_buying_in_id")
    private int id;
    @ColumnInfo(name = "branch_id")
    private int branchId;
    @ColumnInfo(name = "buying_in_id")
    private int buyingInId;

    public BranchBuyingIn(int branchId, int buyingInId) {
        this.branchId = branchId;
        this.buyingInId = buyingInId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public int getBuyingInId() {
        return buyingInId;
    }

    public void setBuyingInId(int buyingInId) {
        this.buyingInId = buyingInId;
    }
}
