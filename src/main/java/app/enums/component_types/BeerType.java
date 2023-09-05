package app.enums.component_types;

public enum BeerType implements ComponentType {
    BEER_LIGHT("пиво светлое","мл"),
    BEER_LIGHTLAGER("пиво лагер светлое","мл"),
    BEER_DARK("пиво тёмное", "мл"),
    BEER_DARKLAGER("пиво лагер тёмное", "мл"),
    BEER_MEXICAN("пиво мексиканское","мл"),
    BEER_CIDER("сидр","мл"),
    BEER_STOUT("пиво стаут", "мл");

    private final String type;
    private final String unit;

    BeerType(String type, String unit) {
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
        for (BeerType value : BeerType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
