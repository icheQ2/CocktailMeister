package app.enums;

public enum ComponentType {
    GIN("джин", "мл"),
    RUM("ром", "мл"),
    WHISKEY("виски", "мл"),
    TEQUILA("текила", "мл"),
    VODKA("водка", "мл"),
    BRANDY("бренди", "мл"),
    LIQUOR("ликёр", "мл"),
    BEER("пиво", "мл"),
    WINE("вино", "мл"),
    LEMONADE("лимонад", "мл"),
    SYRUP("сироп", "мл"),
    JUICE("сок", "мл"),
    FRESH("фреш", "мл"),
    ICE("лёд", "ед");

    private final String type;
    private final String unit;

    ComponentType(String type, String unit) {
        this.type = type;
        this.unit = unit;
    }

    public String getType() {
        return type;
    }
    public String getUnit() {
        return unit;
    }

    public static String getValues() {
        String values = "";
        for (ComponentType value : ComponentType.values()) {
            values += String.format(", %d - %s (%s)", value.ordinal(), value.getType(), value.getUnit());
        }
        return values.substring(2);
    }
}
