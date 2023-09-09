package app.enums.component_types;

public enum VermouthType implements ComponentType {
    VERMOUTH_REDDRY("вермут красный сухой","мл", 0),
    VERMOUTH_REDSWEET("вермут красный сладкий","мл", 1),
    VERMOUTH_WHITEDRY("вермут белый сухой","мл", 2),
    VERMOUTH_WHITESWEET("вермут белый сладкий","мл", 3),
    VERMOUTH_LILLET("лилле","мл", 4);

    private final String type;
    private final String unit;
    private final int ordinal;

    VermouthType(String type, String unit, int ordinal) {
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
        for (VermouthType value : VermouthType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
