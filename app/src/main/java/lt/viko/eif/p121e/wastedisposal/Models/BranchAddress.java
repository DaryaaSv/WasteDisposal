package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_branches", foreignKeys = @ForeignKey(entity = Company.class,
        parentColumns = "company_id",
        childColumns = "company_id",
        onDelete = ForeignKey.CASCADE))
public class BranchAddress {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "branch_id")
    private int id;
    @ColumnInfo(name = "company_id")
    private int companyId;
    @ColumnInfo(name = "country")
    private String country;
    @ColumnInfo(name = "city")
    private String city;
    @ColumnInfo(name = "street")
    private String street;
    @ColumnInfo(name = "house_number")
    private String houseNumber;
    @ColumnInfo(name = "zip_code")
    private String zipCode;
    @ColumnInfo(name = "work_time")
    private String workTime;
    @ColumnInfo(name = "apartment_number")
    private String apartmentNumber;

    public BranchAddress(int companyId, String country, String city, String street,
                         String houseNumber, String zipCode, String workTime, String apartmentNumber) {
        this.companyId = companyId;
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.workTime = workTime;
        this.apartmentNumber = apartmentNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
}
