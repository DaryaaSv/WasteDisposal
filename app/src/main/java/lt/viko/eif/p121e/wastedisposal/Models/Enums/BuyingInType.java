package lt.viko.eif.p121e.wastedisposal.Models.Enums;

public enum BuyingInType {
    BULK_PURCHASE("Bulk Purchase"),
    WHOLESALE("Wholesale"),
    ACQUISITION("Acquisition");

    private final String displayName;

    BuyingInType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
