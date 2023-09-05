package app.enums.component_types;

public enum VermouthType implements ComponentType {
    VERMOUTH_REDDRY("вермут красный сухой","мл"),
    VERMOUTH_REDSWEET("вермут красный сладкий","мл"),
    VERMOUTH_WHITEDRY("вермут белый сухой","мл"),
    VERMOUTH_WHITESWEET("вермут белый сладкий","мл"),
    VERMOUTH_LILLET("лилле","мл");

    private final String type;
    private final String unit;

    VermouthType(String type, String unit) {
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
        for (VermouthType value : VermouthType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
