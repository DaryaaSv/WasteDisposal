package lt.viko.eif.p121e.wastedisposal.Models.Enums;

public enum DeliveryType {
    STANDARD("Standard Shipping"),
    TWO_DAY("Two-Day Shipping"),
    OVERNIGHT("Overnight Shipping"),
    IN_STORE("In-Store Pickup");

    private final String displayName;

    DeliveryType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
