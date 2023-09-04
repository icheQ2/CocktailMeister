package app.enums.component_types;

public enum RumType implements ComponentType {
    RUM_WHITE("ром белый","мл"),
    RUM_GOLD("ром золотой","мл"),
    RUM_DARK("ром тёмный", "мл"),
    RUM_SPICE("ром со специями", "мл");

    private final String type;
    private final String unit;

    RumType(String type, String unit) {
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
        for (RumType value : RumType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
