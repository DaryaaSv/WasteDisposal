package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_customer_address", foreignKeys = {
        @ForeignKey(entity = Customer.class, parentColumns = "customer_id", childColumns = "customer_id"),
        @ForeignKey(entity = Address.class, parentColumns = "address_id", childColumns = "address_id")
})
public class CustomerAddress {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "customer_address_id")
    private int id;
    @ColumnInfo(name = "customer_id")
    private int customerId;
    @ColumnInfo(name = "address_id")
    private int addressId;

    public CustomerAddress(int customerId, int addressId) {
        this.customerId = customerId;
        this.addressId = addressId;
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

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
}
