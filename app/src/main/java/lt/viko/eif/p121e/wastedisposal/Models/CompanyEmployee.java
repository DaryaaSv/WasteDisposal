package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_company_employees", foreignKeys = {
        @ForeignKey(entity = Company.class, parentColumns = "companyID", childColumns = "companyID"),
        @ForeignKey(entity = Employee.class, parentColumns = "employeeID", childColumns = "employeeID")
})
public class CompanyEmployee {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "company_employee_ID")
    private int id;

    @ColumnInfo(name = "companyID")
    private int companyId;

    @ColumnInfo(name = "employeeID")
    private int employeeId;

    public CompanyEmployee(int companyId, int employeeId) {
        this.companyId = companyId;
        this.employeeId = employeeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
