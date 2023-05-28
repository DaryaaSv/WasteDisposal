package lt.viko.eif.p121e.wastedisposal.Util.Converters;

import androidx.room.TypeConverter;
import lt.viko.eif.p121e.wastedisposal.Models.Enums.RecyclingType;

public class RecyclingTypeConverter {
    @TypeConverter
    public static RecyclingType fromString(String value) {
        return RecyclingType.valueOf(value);
    }

    @TypeConverter
    public static String toString(RecyclingType recyclingType) {
        return recyclingType.name();
    }
}
