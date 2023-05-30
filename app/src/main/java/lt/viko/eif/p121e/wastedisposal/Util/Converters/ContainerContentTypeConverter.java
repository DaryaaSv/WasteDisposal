package lt.viko.eif.p121e.wastedisposal.Util.Converters;

import androidx.room.TypeConverter;
import lt.viko.eif.p121e.wastedisposal.Models.Enums.ContainerContentType;

public class ContainerContentTypeConverter {
    @TypeConverter
    public static ContainerContentType fromString(String value) {
        return ContainerContentType.valueOf(value);
    }

    @TypeConverter
    public static String toString(ContainerContentType containerContentType) {
        return containerContentType.name();
    }
}
