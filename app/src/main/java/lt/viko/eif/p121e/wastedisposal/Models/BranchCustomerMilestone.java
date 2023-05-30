package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_branch_customer_milestone", foreignKeys = {
        @ForeignKey(entity = BranchMilestone.class, parentColumns = "branch_milestone_id",
                childColumns = "branch_milestone_id", onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = CustomerMilestone.class, parentColumns = "customer_milestone_id",
                childColumns = "customer_milestone_id", onDelete = ForeignKey.CASCADE)
})
public class BranchCustomerMilestone {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "branch_customer_milestone_id")
    private int id;
    @ColumnInfo(name = "branch_milestone_id")
    private int branchMilestoneId;
    @ColumnInfo(name = "customer_milestone_id")
    private int customerMilestoneId;

    public BranchCustomerMilestone(int branchMilestoneId, int customerMilestoneId) {
        this.branchMilestoneId = branchMilestoneId;
        this.customerMilestoneId = customerMilestoneId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBranchMilestoneId() {
        return branchMilestoneId;
    }

    public void setBranchMilestoneId(int branchMilestoneId) {
        this.branchMilestoneId = branchMilestoneId;
    }

    public int getCustomerMilestoneId() {
        return customerMilestoneId;
    }

    public void setCustomerMilestoneId(int customerMilestoneId) {
        this.customerMilestoneId = customerMilestoneId;
    }
}
