package lt.viko.eif.p121e.wastedisposal.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import lt.viko.eif.p121e.wastedisposal.Models.Enums.TypeOfOrder;
import lt.viko.eif.p121e.wastedisposal.Util.Converters.OrderTypeConverter;

@Entity(tableName = "tbl_order_type")
public class OrderType {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "order_type_id")
    private int id;
    @TypeConverters(OrderTypeConverter.class)
    @ColumnInfo(name = "name")
    private TypeOfOrder name;

    public OrderType(TypeOfOrder name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeOfOrder getName() {
        return name;
    }

    public void setName(TypeOfOrder name) {
        this.name = name;
    }
}
