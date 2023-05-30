package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_addresses")
public class Address {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "address_id")
    private int id;
    @ColumnInfo(name = "country")
    private String country;
    @ColumnInfo(name = "region")
    private String region;
    @ColumnInfo(name = "city")
    private String city;
    @ColumnInfo(name = "zip_code")
    private String zipCode;
    @ColumnInfo(name = "street_name")
    private String streetName;
    @ColumnInfo(name = "street_number")
    private String streetNumber;

    public Address(String country, String region, String city, String zipCode, String streetName, String streetNumber) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }
}
