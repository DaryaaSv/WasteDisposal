package lt.viko.eif.p121e.wastedisposal.Util.Converters;

import androidx.room.TypeConverter;
import lt.viko.eif.p121e.wastedisposal.Models.Enums.Position;

public class PositionConverter {
    @TypeConverter
    public static Position fromString(String value) {
        return Position.valueOf(value);
    }
    @TypeConverter
    public static String toString(Position position) {
        return position.name();
    }
}

