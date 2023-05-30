package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import java.util.Date;

@Entity(tableName = "tbl_comments", foreignKeys = @ForeignKey(entity = BranchAddress.class,
        parentColumns = "branch_id",
        childColumns = "branch_id",
        onDelete = ForeignKey.CASCADE))
public class Comment {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "comment_id")
    private int id;
    @ColumnInfo(name = "branch_id")
    private int branchId;
    @ColumnInfo(name = "text")
    private String text;
    @ColumnInfo(name = "date")
    private Date date;

    public Comment(int branchId, String text, Date date) {
        this.branchId = branchId;
        this.text = text;
        this.date = date;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
