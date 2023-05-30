package lt.viko.eif.p121e.wastedisposal.Models1;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import java.util.Date;
import lt.viko.eif.p121e.wastedisposal.Util.Converters.DateTypeConverter;

@Entity(tableName = "tbl_comments")
public class Comment {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "comment_id")
    private int id;
    @ColumnInfo(name = "text")
    private String text;
    @TypeConverters(DateTypeConverter.class)
    @ColumnInfo(name = "date")
    private Date date;

    public Comment(String text, Date date) {
        this.text = text;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
