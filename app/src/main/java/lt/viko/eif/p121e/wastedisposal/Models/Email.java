package lt.viko.eif.p121e.wastedisposal.Models;

import javax.persistence.JoinColumn;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_emails")
public class Email {
    @Id
    @Column(name = "email_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "email_address")
    private String emailAddress;
    @ManyToOne
    @JoinColumn(name = "branch_id")
    private BranchAddress branch;

    public Email(String emailAddress, BranchAddress branch) {
        this.emailAddress = emailAddress;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public BranchAddress getBranch() {
        return branch;
    }

    public void setBranch(BranchAddress branch) {
        this.branch = branch;
    }
}
