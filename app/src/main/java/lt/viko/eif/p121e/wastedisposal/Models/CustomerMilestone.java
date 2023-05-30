package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_customers_milestones", foreignKeys = {
        @ForeignKey(entity = Customer.class, parentColumns = "customer_id", childColumns = "customer_id"),
        @ForeignKey(entity = Order.class, parentColumns = "order_id", childColumns = "order_id")
})
public class CustomerMilestone {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "customer_milestone_id")
    private int id;
    @ColumnInfo(name = "customer_id")
    private int customerId;
    @ColumnInfo(name = "order_id")
    private int orderId;
    @ColumnInfo(name = "completed")
    private boolean completed;
    @ColumnInfo(name = "progress")
    private float progress;

    public CustomerMilestone(int customerId, int orderId, boolean completed, float progress) {
        this.customerId = customerId;
        this.orderId = orderId;
        this.completed = completed;
        this.progress = progress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public float getProgress() {
        return progress;
    }

    public void setProgress(float progress) {
        this.progress = progress;
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
