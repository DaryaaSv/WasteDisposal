package lt.viko.eif.p121e.wastedisposal.Models.Enums;

public enum ContainerContentType {
    GENERAL("General"),
    RECYCLABLE("Recyclable"),
    HAZARDOUS("Hazardous"),
    ORGANIC("Organic"),
    ELECTRONICS("Electronics"),
    LIQUID("Liquid"),
    METAL("Metal");

    private String displayName;

    ContainerContentType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}






