package lt.viko.eif.p121e.wastedisposal.Util.Converters;

import androidx.room.TypeConverter;
import lt.viko.eif.p121e.wastedisposal.Models.Enums.ServiceType;

public class ServiceTypeConverter {
    @TypeConverter
    public static ServiceType fromString(String value) {
        return ServiceType.valueOf(value);
    }
    @TypeConverter
    public static String toString(ServiceType serviceType) {
        return serviceType.name();
    }
}
