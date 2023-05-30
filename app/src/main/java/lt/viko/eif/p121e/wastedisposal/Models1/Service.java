package lt.viko.eif.p121e.wastedisposal.Models1;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import lt.viko.eif.p121e.wastedisposal.Models.Enums.ServiceType;
import lt.viko.eif.p121e.wastedisposal.Util.Converters.ServiceTypeConverter;

@Entity(tableName = "tbl_service")
public class Service {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "service_id")
    private int id;
    @TypeConverters(ServiceTypeConverter.class)
    @ColumnInfo(name = "type")
    private ServiceType type;

    public Service(ServiceType type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ServiceType getType() {
        return type;
    }

    public void setType(ServiceType type) {
        this.type = type;
    }
}
