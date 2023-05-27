package lt.viko.eif.p121e.wastedisposal.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lt.viko.eif.p121e.wastedisposal.Models.Enums.ContainerContentType;
import lt.viko.eif.p121e.wastedisposal.Models.Enums.ContainerType;

@Entity
@Table(name = "tbl_containers")
public class Container {
    @Id
    @Column(name = "container_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "branch_id")
    private BranchAddress branch;
    private String street;
    @Column(name = "house_number")
    private String houseNumber;
    @Column(name = "zip_code")
    private String zipCode;
    private float capacity;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private ContainerType type;
    @Column(name = "content_type")
    @Enumerated(EnumType.STRING)
    private ContainerContentType contentType;

    public Container(BranchAddress branch, String street, String houseNumber, String zipCode,
                     float capacity, ContainerType type, ContainerContentType contentType) {
        this.branch = branch;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.capacity = capacity;
        this.type = type;
        this.contentType = contentType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BranchAddress getBranch() {
        return branch;
    }

    public void setBranch(BranchAddress branch) {
        this.branch = branch;
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

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public ContainerType getType() {
        return type;
    }

    public void setType(ContainerType type) {
        this.type = type;
    }

    public ContainerContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContainerContentType contentType) {
        this.contentType = contentType;
    }
}
