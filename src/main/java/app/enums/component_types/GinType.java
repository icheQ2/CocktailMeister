package app.enums.component_types;

public enum GinType implements ComponentType {
    GIN_LONDONDRY("джин лондонский сухой","мл", 0),
    GIN_OLDTOM("джин олд том","мл", 1),
    GIN_SLOE("джин слоу", "мл", 2),
    GIN_RASPBERRY("джин малиновый", "мл", 3);

    private final String type;
    private final String unit;
    private final int ordinal;

    GinType(String type, String unit, int ordinal) {
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
        for (GinType value : GinType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
