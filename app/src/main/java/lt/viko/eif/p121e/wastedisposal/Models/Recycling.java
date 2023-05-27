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
import lt.viko.eif.p121e.wastedisposal.Models.Enums.RecyclingType;

@Entity
@Table(name = "tbl_recycling")
public class Recycling {
    @Id
    @Column(name = "recycling_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "recycling_type")
    @Enumerated(EnumType.STRING)
    private RecyclingType recyclingType;
    private String description;
    @ManyToOne
    @JoinColumn(name = "branch_id")
    private BranchAddress branch;

    public Recycling(String name, RecyclingType recyclingType, String description, BranchAddress branch) {
        this.name = name;
        this.recyclingType = recyclingType;
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

    public RecyclingType getRecyclingType() {
        return recyclingType;
    }

    public void setRecyclingType(RecyclingType recyclingType) {
        this.recyclingType = recyclingType;
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
