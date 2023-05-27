package lt.viko.eif.p121e.wastedisposal.Models.Enums;

public enum Position {
    MANAGER("Manager"),
    SUPERVISOR("Supervisor"),
    DRIVER("Driver"),
    OPERATOR("Operator"),
    TECHNICIAN("Technician"),
    LABORER("Laborer");

    private final String positionName;

    Position(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionName() {
        return positionName;
    }
}
