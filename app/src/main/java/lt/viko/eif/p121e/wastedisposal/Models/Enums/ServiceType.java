package lt.viko.eif.p121e.wastedisposal.Models.Enums;

public enum ServiceType {
    COLLECTION("Collection"),
    RECYCLING("Recycling"),
    COMPOSTING("Composting"),
    LANDFILL("Landfill");

    private String displayName;

    ServiceType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
