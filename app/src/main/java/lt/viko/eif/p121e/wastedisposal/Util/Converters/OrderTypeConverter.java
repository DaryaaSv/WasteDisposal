package lt.viko.eif.p121e.wastedisposal.Util.Converters;

import androidx.room.TypeConverter;

import lt.viko.eif.p121e.wastedisposal.Models.Enums.TypeOfOrder;

public class OrderTypeConverter {
    @TypeConverter
    public static TypeOfOrder fromString(String value) {
        return TypeOfOrder.valueOf(value);
    }

    @TypeConverter
    public static String toString(TypeOfOrder orderType) {
        return orderType.name();
    }
}