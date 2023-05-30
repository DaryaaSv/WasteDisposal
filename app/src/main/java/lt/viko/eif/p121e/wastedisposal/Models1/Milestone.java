package lt.viko.eif.p121e.wastedisposal.Models1;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_milestones")
public class Milestone {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "milestone_id")
    private int id;
    @ColumnInfo(name = "condition")
    private String condition;
    @ColumnInfo(name = "milestone_code")
    private String milestoneCode;
    @ColumnInfo(name = "description")
    private String description;

    public Milestone(String condition, String milestoneCode, String description) {
        this.condition = condition;
        this.milestoneCode = milestoneCode;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getMilestoneCode() {
        return milestoneCode;
    }

    public void setMilestoneCode(String milestoneCode) {
        this.milestoneCode = milestoneCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
