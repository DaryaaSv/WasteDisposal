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
import lt.viko.eif.p121e.wastedisposal.Models.Enums.BuyingInType;
import lt.viko.eif.p121e.wastedisposal.Models.Enums.DeliveryType;

@Entity
@Table(name = "tbl_buying_in")
public class BuyingIn {
    @Id
    @Column(name = "buying_in_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private float price;
    private String measurement;
    private String description;
    @Column(name = "delivery_type")
    @Enumerated(EnumType.STRING)
    private DeliveryType deliveryType;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private BuyingInType type;
    @ManyToOne
    @JoinColumn(name = "branch_id")
    private BranchAddress branch;

    public BuyingIn(String name, float price, String measurement, String description,
                    DeliveryType deliveryType, BuyingInType type, BranchAddress branch) {
        this.name = name;
        this.price = price;
        this.measurement = measurement;
        this.description = description;
        this.deliveryType = deliveryType;
        this.type = type;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
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

    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(DeliveryType deliveryType) {
        this.deliveryType = deliveryType;
    }

    public BuyingInType getType() {
        return type;
    }

    public void setType(BuyingInType type) {
        this.type = type;
    }

    public BranchAddress getBranch() {
        return branch;
    }

    public void setBranch(BranchAddress branch) {
        this.branch = branch;
    }
}
