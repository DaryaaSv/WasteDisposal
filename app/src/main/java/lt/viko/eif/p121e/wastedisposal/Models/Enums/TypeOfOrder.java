package lt.viko.eif.p121e.wastedisposal.Models.Enums;

public enum TypeOfOrder {
    PURCHASE("Purchase"),
    SALE("Sale"),
    RETURN("Return"),
    RECYCLE("Recycle"),
    DISPOSE("Dispose");

    private final String displayName;

    TypeOfOrder(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
