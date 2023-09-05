package app.enums.component_types;

public enum IceType implements ComponentType {
    ICE_CUBES("лёд кубиками","порц"),
    ICE_CRUSHED("лёд колотый","порц");

    private final String type;
    private final String unit;

    IceType(String type, String unit) {
        this.type = type;
        this.unit = unit;
    }

    @Override
    public String getType() {
        return type;
    }
    @Override
    public String getUnit() {
        return unit;
    }

    public static String getValues() {
        String values = "";
        for (IceType value : IceType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
