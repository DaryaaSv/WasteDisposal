package lt.viko.eif.p121e.wastedisposal.Models.Enums;

public enum RecyclingType {
    PAPER("Paper"),
    PLASTIC("Plastic"),
    GLASS("Glass"),
    METAL("Metal"),
    ELECTRONICS("Electronics"),
    ORGANIC("Organic");

    private String displayName;

    RecyclingType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}





