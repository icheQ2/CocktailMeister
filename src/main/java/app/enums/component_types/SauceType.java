package app.enums.component_types;

public enum SauceType implements ComponentType {
    SAUCE_TABASCO("соус табаско","мл"),
    SAUCE_CHOCO("соус шоколадный","мл"),
    SAUCE_SOY("соус соевый","мл"),
    SAUCE_WORCESTER("соус ворчестер","мл");

    private final String type;
    private final String unit;

    SauceType(String type, String unit) {
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
        for (SauceType value : SauceType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
