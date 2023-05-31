package lt.viko.eif.p121e.wastedisposal.Models.DAOs;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import lt.viko.eif.p121e.wastedisposal.Models.Company;

@Dao
public interface CompanyDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Company company);

    @Update
    void update(Company company);

    @Delete
    void delete(Company company);

    @Query("SELECT * FROM tbl_companies")
    List<Company> getAllCompanies();

    @Query("SELECT * FROM tbl_companies WHERE company_id = :companyId")
    Company getCompanyById(int companyId);
}