package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.util.Date;

import lt.viko.eif.p121e.wastedisposal.Util.Converters.DateTypeConverter;

@Entity(tableName = "tbl_orders", foreignKeys = {
        @ForeignKey(entity = Customer.class, parentColumns = "customer_id",
                childColumns = "customer_id", onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = Branch.class, parentColumns = "branch_id",
                childColumns = "branch_id", onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = OrderType.class, parentColumns = "order_type_id",
                childColumns = "order_type_id", onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = Service.class, parentColumns = "service_id",
                childColumns = "service_id", onDelete = ForeignKey.CASCADE)
}) public class Order {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "order_id")
    private int id;
    @ColumnInfo(name = "is_done")
    private boolean isDone;
    @ColumnInfo(name = "customer_note")
    private String customerNote;
    @TypeConverters(DateTypeConverter.class)
    @ColumnInfo(name = "order_date")
    private Date orderDate;
    @ColumnInfo(name = "customer_id")
    private String customerId;
    @ColumnInfo(name = "branch_id")
    private int branchId;
    @ColumnInfo(name = "order_type_id")
    private String orderTypeId;
    @ColumnInfo(name = "service_id")
    private String serviceId;

    public Order(boolean isDone, String customerNote, Date orderDate, String customerId,
                 int branchId, String orderTypeId, String serviceId) {
        this.isDone = isDone;
        this.customerNote = customerNote;
        this.orderDate = orderDate;
        this.customerId = customerId;
        this.branchId = branchId;
        this.orderTypeId = orderTypeId;
        this.serviceId = serviceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(String orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
}
