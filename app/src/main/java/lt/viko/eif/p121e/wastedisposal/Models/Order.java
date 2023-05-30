package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_orders", foreignKeys = {
        @ForeignKey(entity = Customer.class, parentColumns = "customer_id", childColumns = "customer_id"),
        @ForeignKey(entity = BranchAddress.class, parentColumns = "branch_id", childColumns = "branch_id")
})
public class Order {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "order_id")
    private int id;

    @ColumnInfo(name = "customer_id")
    private int customerId;

    @ColumnInfo(name = "branch_id")
    private int branchId;

    @ColumnInfo(name = "is_done")
    private boolean isDone;

    @ColumnInfo(name = "customer_note")
    private String customerNote;

    public Order(int customerId, int branchId, boolean isDone, String customerNote) {
        this.customerId = customerId;
        this.branchId = branchId;
        this.isDone = isDone;
        this.customerNote = customerNote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public String getCustomerNote() {
        return customerNote;
    }

    public void setCustomerNote(String customerNote) {
        this.customerNote = customerNote;
    }
}
