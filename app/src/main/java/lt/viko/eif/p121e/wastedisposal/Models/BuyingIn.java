package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_buying_in", foreignKeys = {
        @ForeignKey(entity = Order.class, parentColumns = "order_id", childColumns = "order_id"),
        @ForeignKey(entity = Material.class, parentColumns = "material_id", childColumns = "material_id"),
        @ForeignKey(entity = MaterialType.class, parentColumns = "material_type_id", childColumns = "material_type_id")
})
public class BuyingIn {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "buying_in_id")
    private int id;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "price")
    private float price;
    @ColumnInfo(name = "measurement")
    private String measurement;
    @ColumnInfo(name = "amount")
    private float amount;
    @ColumnInfo(name = "description")
    private String description;
    @ColumnInfo(name = "order_id")
    private int orderId;
    @ColumnInfo(name = "material_id")
    private int materialId;
    @ColumnInfo(name = "material_type_id")
    private int materialTypeId;

    public BuyingIn(String name, float price, String measurement, float amount, String description,
                    int orderId, int materialId, int materialTypeId) {
        this.name = name;
        this.price = price;
        this.measurement = measurement;
        this.amount = amount;
        this.description = description;
        this.orderId = orderId;
        this.materialId = materialId;
        this.materialTypeId = materialTypeId;
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

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public int getMaterialTypeId() {
        return materialTypeId;
    }

    public void setMaterialTypeId(int materialTypeId) {
        this.materialTypeId = materialTypeId;
    }
}
