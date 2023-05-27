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
import lt.viko.eif.p121e.wastedisposal.Models.Enums.WasteCollectionType;

@Entity
@Table(name = "tbl_waste_collections")
public class WasteCollection {
    @Id
    @Column(name = "waste_collection_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private WasteCollectionType type;
    private String measurement;
    private String description;
    @ManyToOne
    @JoinColumn(name = "branch_id")
    private BranchAddress branch;

    public WasteCollection(String name, double price, WasteCollectionType type, String measurement,
                           String description, BranchAddress branch) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.measurement = measurement;
        this.description = description;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public WasteCollectionType getType() {
        return type;
    }

    public void setType(WasteCollectionType type) {
        this.type = type;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BranchAddress getBranch() {
        return branch;
    }

    public void setBranch(BranchAddress branch) {
        this.branch = branch;
    }
}
