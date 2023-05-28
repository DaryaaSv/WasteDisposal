package lt.viko.eif.p121e.wastedisposal.Util.Converters;

import androidx.room.TypeConverter;

import lt.viko.eif.p121e.wastedisposal.Models.Enums.DeliveryType;

public class DeliveryTypeConverter {
    @TypeConverter
    public static DeliveryType fromString(String value) {
        return DeliveryType.valueOf(value);
    }

    @TypeConverter
    public static String toString(DeliveryType deliveryType) {
        return deliveryType.name();
    }
}
