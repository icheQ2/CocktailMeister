package app.enums.component_types;

public enum RumType implements ComponentType {
    RUM_WHITE("ром белый","мл", 0),
    RUM_GOLD("ром золотой","мл", 1),
    RUM_DARK("ром тёмный", "мл", 2),
    RUM_SPICE("ром со специями", "мл", 3);

    private final String type;
    private final String unit;
    private final int ordinal;

    RumType(String type, String unit, int ordinal) {
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
        for (RumType value : RumType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
