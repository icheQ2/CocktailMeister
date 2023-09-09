package app.enums.component_types;

public enum IceType implements ComponentType {
    ICE_CUBES("лёд кубиками","порц", 0),
    ICE_CRUSHED("лёд колотый","порц", 1);

    private final String type;
    private final String unit;
    private final int ordinal;

    IceType(String type, String unit, int ordinal) {
        this.type = type;
        this.unit = unit;
        this.ordinal = ordinal();
    }

    @Override
    public String getType() {
        return type;
    }
    @Override
    public String getUnit() {
        return unit;
    }
    @Override
    public int getOrdinal() {
        return ordinal;
    }

    public static String getValues() {
        String values = "";
        for (IceType value : IceType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
