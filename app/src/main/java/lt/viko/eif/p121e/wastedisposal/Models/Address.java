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

    public Address(String country, String region, String city) {
        this.country = country;
        this.region = region;
        this.city = city;
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

}
