package lt.viko.eif.p121e.wastedisposal.Models.Enums;

public enum ContainerType {
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    private final String containerTypeName;

    ContainerType(String containerTypeName) {
        this.containerTypeName = containerTypeName;
    }

    public String getContainerTypeName() {
        return containerTypeName;
    }
}
