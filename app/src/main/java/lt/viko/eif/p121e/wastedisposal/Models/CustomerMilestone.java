package lt.viko.eif.p121e.wastedisposal.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_customers_milestones")
public class CustomerMilestone {
    @Column(name = "customer_milestone_id")
    private int id;
    @ManyToOne
    @JoinColumn(name = "milestone_id")
    private Milestone milestone;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @OneToMany
    @JoinColumn(name = "order_id")
    private Order order;

    public CustomerMilestone(Milestone milestone, Customer customer, Order order) {
        this.milestone = milestone;
        this.customer = customer;
        this.order = order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Milestone getMilestone() {
        return milestone;
    }

    public void setMilestone(Milestone milestone) {
        this.milestone = milestone;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
