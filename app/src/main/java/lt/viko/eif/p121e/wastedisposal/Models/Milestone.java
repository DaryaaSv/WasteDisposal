package lt.viko.eif.p121e.wastedisposal.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_milestones")
public class Milestone {
    @Id
    @Column(name = "milestone_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String condition;
    @Column(name = "milestone_code")
    private String milestoneCode;
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
