package lt.viko.eif.p121e.wastedisposal.Models.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.Employee;

@Dao
public interface EmployeeDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Employee employee);

    @Update
    void update(Employee employee);

    @Delete
    void delete(Employee employee);

    @Query("SELECT * FROM tbl_employees")
    List<Employee> getAllEmployees();

    @Query("SELECT * FROM tbl_employees WHERE employee_id = :id")
    Employee getEmployeeById(int id);

    @Query("SELECT * FROM tbl_employees WHERE username = :username")
    Employee getEmployeeByUsername(String username);
}