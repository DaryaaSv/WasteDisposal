package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_recycling", foreignKeys = {
        @ForeignKey(entity = MaterialType.class, parentColumns = "material_type_id",
                childColumns = "material_type_id", onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = Material.class, parentColumns = "material_id",
                childColumns = "material_id", onDelete = ForeignKey.CASCADE),
})
public class Recycling {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "recycling_id")
    private int id;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "description")
    private String description;
    @ColumnInfo(name = "amount")
    private float amount;
    @ColumnInfo(name = "material_id")
    private int materialId;
    @ColumnInfo(name = "material_type_id")
    private int materialTypeId;

    public Recycling(String name, String description, float amount, int materialId, int materialTypeId) {
        this.name = name;
        this.description = description;
        this.amount = amount;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
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
