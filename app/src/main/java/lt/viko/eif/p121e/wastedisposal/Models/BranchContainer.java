package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_branch_containers", foreignKeys = {
    @ForeignKey(entity = Branch.class, parentColumns = "branch_id",
            childColumns = "branch_id", onDelete = ForeignKey.CASCADE),
    @ForeignKey(entity = Container.class, parentColumns = "container_id",
            childColumns = "container_id", onDelete = ForeignKey.CASCADE),
    @ForeignKey(entity = Service.class, parentColumns = "service_id",
            childColumns = "service_id", onDelete = ForeignKey.CASCADE)
})
public class BranchContainer {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "branch_container_id")
    private int id;
    @ColumnInfo(name = "branch_id")
    private int branchId;
    @ColumnInfo(name = "container_id")
    private String containerId;
    @ColumnInfo(name = "service_id")
    private String serviceId;

    public BranchContainer(int branchId, String containerId, String serviceId) {
        this.branchId = branchId;
        this.containerId = containerId;
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

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
}

