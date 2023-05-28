package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_services", foreignKeys = {
        @ForeignKey(entity = Order.class, parentColumns = "order_id", childColumns = "order_id"),
        @ForeignKey(entity = WasteCollection.class, parentColumns = "waste_collection_id",
                childColumns = "waste_collection_id")
})
public class Service {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "service_id")
    private int id;

    @ColumnInfo(name = "order_id")
    private int orderId;

    @ColumnInfo(name = "waste_collection_id")
    private int wasteCollectionId;

    public Service(int orderId, int wasteCollectionId) {
        this.orderId = orderId;
        this.wasteCollectionId = wasteCollectionId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getWasteCollectionId() {
        return wasteCollectionId;
    }

    public void setWasteCollectionId(int wasteCollectionId) {
        this.wasteCollectionId = wasteCollectionId;
    }
}
