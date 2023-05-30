package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_branch_containers", foreignKeys = {
        @ForeignKey(entity = Branch.class, parentColumns = "branch_id",
                childColumns = "branch_id", onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = Truck.class, parentColumns = "truck_id",
                childColumns = "truck_id", onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = Service.class, parentColumns = "service_id",
                childColumns = "service_id", onDelete = ForeignKey.CASCADE)
})
public class BranchTruck {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "branch_truck_id")
    private int id;
    @ColumnInfo(name = "branch_id")
    private int branchId;
    @ColumnInfo(name = "truck_id")
    private String truckId;
    @ColumnInfo(name = "service_id")
    private String serviceId;

    public BranchTruck(int branchId, String truckId, String serviceId) {
        this.branchId = branchId;
        this.truckId = truckId;
        this.serviceId = serviceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
}
