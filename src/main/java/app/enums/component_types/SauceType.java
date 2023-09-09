package app.enums.component_types;

public enum SauceType implements ComponentType {
    SAUCE_TABASCO("соус табаско","мл", 0),
    SAUCE_CHOCO("соус шоколадный","мл", 1),
    SAUCE_SOY("соус соевый","мл", 2),
    SAUCE_WORCESTER("соус ворчестер","мл", 3);

    private final String type;
    private final String unit;
    private final int ordinal;

    SauceType(String type, String unit, int ordinal) {
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
        for (SauceType value : SauceType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
