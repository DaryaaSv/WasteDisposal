package lt.viko.eif.p121e.wastedisposal.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_trucks")
public class Truck {
    @Id
    @Column(name = "truck_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String Model;
    private String licensePlate;
    private float capacity;
    private String status;
    private String coordinates;
    @ManyToOne
    @JoinColumn(name = "branch_id")
    private BranchAddress branch;

    public Truck(String name, String model, String licensePlate, float capacity, String status,
                 String coordinates, BranchAddress branch) {
        this.name = name;
        Model = model;
        this.licensePlate = licensePlate;
        this.capacity = capacity;
        this.status = status;
        this.coordinates = coordinates;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public BranchAddress getBranch() {
        return branch;
    }

    public void setBranch(BranchAddress branch) {
        this.branch = branch;
    }
}
