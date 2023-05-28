package lt.viko.eif.p121e.wastedisposal.Models;

import lt.viko.eif.p121e.wastedisposal.Models.Enums.BuyingInType;
import lt.viko.eif.p121e.wastedisposal.Models.Enums.DeliveryType;
import lt.viko.eif.p121e.wastedisposal.Util.Converters.BuyingInTypeConverter;
import lt.viko.eif.p121e.wastedisposal.Util.Converters.DeliveryTypeConverter;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

@Entity(tableName = "tbl_buying_in")
public class BuyingIn {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "buying_in_id")
    private int id;
    private String name;
    private float price;
    private String measurement;
    private String description;
    @ColumnInfo(name = "delivery_type")
    @TypeConverters(DeliveryTypeConverter.class)
    private DeliveryType deliveryType;
    @ColumnInfo(name = "type")
    @TypeConverters(BuyingInTypeConverter.class)
    private BuyingInType type;
    @ColumnInfo(name = "branch_id")
    private int branchId;

    public BuyingIn(String name, float price, String measurement, String description,
                    DeliveryType deliveryType, BuyingInType type, int branchId) {
        this.name = name;
        this.price = price;
        this.measurement = measurement;
        this.description = description;
        this.deliveryType = deliveryType;
        this.type = type;
        this.branchId = branchId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(DeliveryType deliveryType) {
        this.deliveryType = deliveryType;
    }

    public BuyingInType getType() {
        return type;
    }

    public void setType(BuyingInType type) {
        this.type = type;
    }

}
