package lt.viko.eif.p121e.wastedisposal.Models1;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_branch_containers", foreignKeys = {
        @ForeignKey(entity = Branch.class, parentColumns = "branch_id",
                childColumns = "branch_id", onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = Customer.class, parentColumns = "customer_id",
                childColumns = "customer_id", onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = Comment.class, parentColumns = "comment_id",
                childColumns = "comment_id", onDelete = ForeignKey.CASCADE)
})
public class CustomerComment {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "branch_container_id")
    private int id;
    @ColumnInfo(name = "branch_id")
    private int branchId;
    @ColumnInfo(name = "customer_id")
    private String customerId;
    @ColumnInfo(name = "comment_id")
    private String commentId;

    public CustomerComment(int branchId, String customerId, String commentId) {
        this.branchId = branchId;
        this.customerId = customerId;
        this.commentId = commentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }
}
