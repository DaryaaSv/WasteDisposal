package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_customers_milestones", foreignKeys = {
        @ForeignKey(entity = Milestone.class, parentColumns = "milestone_id", childColumns = "milestone_id"),
        @ForeignKey(entity = Customer.class, parentColumns = "customer_id", childColumns = "customer_id"),
        @ForeignKey(entity = Order.class, parentColumns = "order_id", childColumns = "order_id")
})
public class CustomerMilestone {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "customer_milestone_id")
    private int id;
    @ColumnInfo(name = "milestone_id")
    private int milestoneId;
    @ColumnInfo(name = "customer_id")
    private int customerId;
    @ColumnInfo(name = "order_id")
    private int orderId;

    public CustomerMilestone(int milestoneId, int customerId, int orderId) {
        this.milestoneId = milestoneId;
        this.customerId = customerId;
        this.orderId = orderId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMilestoneId() {
        return milestoneId;
    }

    public void setMilestoneId(int milestoneId) {
        this.milestoneId = milestoneId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
