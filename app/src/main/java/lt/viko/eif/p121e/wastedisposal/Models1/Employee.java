package lt.viko.eif.p121e.wastedisposal.Models1;

import lt.viko.eif.p121e.wastedisposal.Models1.Enums.Position;
import lt.viko.eif.p121e.wastedisposal.Util.Converters.PositionConverter;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

@Entity(tableName = "tbl_employees")
public class Employee {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "employee_id")
    private int id;
    @ColumnInfo(name = "username")
    private String username;
    @ColumnInfo(name = "password")
    private String password;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "position")
    @TypeConverters(PositionConverter.class)
    private Position position;

    public Employee(String username, String password, String name, Position position) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
