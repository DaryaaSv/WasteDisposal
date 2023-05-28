package lt.viko.eif.p121e.wastedisposal.Models;

import lt.viko.eif.p121e.wastedisposal.Models.Enums.RecyclingType;
import lt.viko.eif.p121e.wastedisposal.Util.Converters.RecyclingTypeConverter;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

@Entity(tableName = "tbl_recycling", foreignKeys = {
        @ForeignKey(entity = BranchAddress.class, parentColumns = "branch_id", childColumns = "branch_id")
})
public class Recycling {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "recycling_id")
    private int id;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "recycling_type")
    @TypeConverters(RecyclingTypeConverter.class)
    private RecyclingType recyclingType;
    @ColumnInfo(name = "description")
    private String description;
    @ColumnInfo(name = "branch_id")
    private int branchId;

    public Recycling(String name, RecyclingType recyclingType, String description, int branchId) {
        this.name = name;
        this.recyclingType = recyclingType;
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

    public RecyclingType getRecyclingType() {
        return recyclingType;
    }

    public void setRecyclingType(RecyclingType recyclingType) {
        this.recyclingType = recyclingType;
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
