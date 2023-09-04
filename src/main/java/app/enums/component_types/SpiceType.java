package app.enums.component_types;

public enum SpiceType implements ComponentType {
    SPICE_NUTMEG("мускатный орех","гр"),
    SPICE_SPICESALT("соль со специями","гр"),
    SPICE_SALT("соль","гр");

    private final String type;
    private final String unit;

    SpiceType(String type, String unit) {
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
        for (SpiceType value : SpiceType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
