package app.enums.component_types;

public enum VodkaType implements ComponentType {
    VODKA_REGULAR("водка обычная","мл", 0),
    VODKA_VANILLA("водка ванильная","мл", 1),
    VODKA_PEACH("водка персиковая","мл", 2);

    private final String type;
    private final String unit;
    private final int ordinal;

    VodkaType(String type, String unit, int ordinal) {
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
        for (VodkaType value : VodkaType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
