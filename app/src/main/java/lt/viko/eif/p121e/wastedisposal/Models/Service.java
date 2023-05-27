package lt.viko.eif.p121e.wastedisposal.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_services")
public class Service {
    @Id
    @Column(name = "service_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @OneToMany
    @JoinColumn(name = "waste_collection_id")
    private WasteCollection wasteCollection;

    public Service(Order order, WasteCollection wasteCollection) {
        this.order = order;
        this.wasteCollection = wasteCollection;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public WasteCollection getWasteCollection() {
        return wasteCollection;
    }

    public void setWasteCollection(WasteCollection wasteCollection) {
        this.wasteCollection = wasteCollection;
    }
}
