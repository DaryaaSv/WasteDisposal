package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_branch_milestone", foreignKeys = {
        @ForeignKey(entity = Branch.class, parentColumns = "branch_id",
                childColumns = "branch_id", onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = Milestone.class, parentColumns = "milestone_id",
                childColumns = "milestone_id", onDelete = ForeignKey.CASCADE)
})
public class BranchMilestone {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "branch_milestone_id")
    private int id;
    @ColumnInfo(name = "branch_id")
    private int branchId;
    @ColumnInfo(name = "milestone_id")
    private String milestoneId;

    public BranchMilestone(int branchId, String milestoneId) {
        this.branchId = branchId;
        this.milestoneId = milestoneId;
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

    public String getMilestoneId() {
        return milestoneId;
    }

    public void setMilestoneId(String milestoneId) {
        this.milestoneId = milestoneId;
    }
}
