package lt.viko.eif.p121e.wastedisposal.Util.Converters;

import androidx.room.TypeConverter;

import lt.viko.eif.p121e.wastedisposal.Models.Enums.BuyingInType;

public class BuyingInTypeConverter {
    @TypeConverter
    public static BuyingInType fromString(String value) {
        return BuyingInType.valueOf(value);
    }

    @TypeConverter
    public static String toString(BuyingInType buyingInType) {
        return buyingInType.name();
    }
}
