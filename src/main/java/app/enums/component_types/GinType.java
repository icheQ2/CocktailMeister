package app.enums.component_types;

public enum GinType implements ComponentType {
    GIN_LONDONDRY("джин лондонский сухой","мл"),
    GIN_OLDTOM("джин олд том","мл"),
    GIN_SLOE("джин слоу", "мл");

    private final String type;
    private final String unit;

    GinType(String type, String unit) {
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
        for (GinType value : GinType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
