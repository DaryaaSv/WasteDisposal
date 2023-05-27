package lt.viko.eif.p121e.wastedisposal.Models.Enums;

public enum WasteCollectionType {
    GARBAGE("Garbage"),
    RECYCLABLES("Recyclables"),
    COMPOST("Compost"),
    HAZARDOUS("Hazardous");

    private final String displayName;

    WasteCollectionType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
