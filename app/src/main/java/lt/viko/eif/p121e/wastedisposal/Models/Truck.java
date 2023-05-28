package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_trucks", foreignKeys = {
        @ForeignKey(entity = BranchAddress.class, parentColumns = "branch_id", childColumns = "branch_id")
})
public class Truck {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "truck_id")
    private int id;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "model")
    private String model;
    @ColumnInfo(name = "license_plate")
    private String licensePlate;
    @ColumnInfo(name = "capacity")
    private float capacity;
    @ColumnInfo(name = "status")
    private String status;
    @ColumnInfo(name = "coordinates")
    private String coordinates;
    @ColumnInfo(name = "branch_id")
    private int branchId;

    public Truck(String name, String model, String licensePlate, float capacity, String status,
                 String coordinates, int branchId) {
        this.name = name;
        this.model = model;
        this.licensePlate = licensePlate;
        this.capacity = capacity;
        this.status = status;
        this.coordinates = coordinates;
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


    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }
}
