package lt.viko.eif.p121e.wastedisposal.Util.Converters;

import androidx.room.TypeConverter;

import lt.viko.eif.p121e.wastedisposal.Models.Enums.ContainerType;

public class ContainerTypeConverter {
    @TypeConverter
    public static ContainerType fromString(String value) {
        return ContainerType.valueOf(value);
    }

    @TypeConverter
    public static String toString(ContainerType containerType) {
        return containerType.name();
    }
}
