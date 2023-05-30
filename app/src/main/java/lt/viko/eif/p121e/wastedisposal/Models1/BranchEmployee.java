package lt.viko.eif.p121e.wastedisposal.Models1;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_branch_containers", foreignKeys = {
        @ForeignKey(entity = Branch.class, parentColumns = "branch_id",
                childColumns = "branch_id", onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = Employee.class, parentColumns = "employee_id",
                childColumns = "employee_id", onDelete = ForeignKey.CASCADE)
})
public class BranchEmployee {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "branch_employee_id")
    private int id;
    @ColumnInfo(name = "branch_id")
    private int branchId;
    @ColumnInfo(name = "employee_id")
    private String employeeId;

    public BranchEmployee(int branchId, String employeeId) {
        this.branchId = branchId;
        this.employeeId = employeeId;
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

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}

