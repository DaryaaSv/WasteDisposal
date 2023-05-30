package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import lt.viko.eif.p121e.wastedisposal.Models.Enums.WasteCollectionType;
import lt.viko.eif.p121e.wastedisposal.Util.Converters.WasteCollectionTypeConverter;

@Entity(tableName = "tbl_waste_collections", foreignKeys = {
        @ForeignKey(entity = BranchAddress.class, parentColumns = "branch_id", childColumns = "branch_id")
})
public class WasteCollection {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "waste_collection_id")
    private int id;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "price")
    private double price;
    @ColumnInfo(name = "type")
    @TypeConverters(WasteCollectionTypeConverter.class)
    private WasteCollectionType type;
    @ColumnInfo(name = "measurement")
    private String measurement;
    @ColumnInfo(name = "description")
    private String description;
    @ColumnInfo(name = "branch_id")
    private int branchId;

    public WasteCollection(String name, double price, WasteCollectionType type, String measurement,
                           String description, int branchId) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.measurement = measurement;
        this.description = description;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public WasteCollectionType getType() {
        return type;
    }

    public void setType(WasteCollectionType type) {
        this.type = type;
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

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }
}
