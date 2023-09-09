package app.enums.component_types;

public enum BeerType implements ComponentType {
    BEER_LIGHT("пиво светлое","мл", 0),
    BEER_LIGHTLAGER("пиво лагер светлое","мл", 1),
    BEER_DARK("пиво тёмное", "мл", 2),
    BEER_DARKLAGER("пиво лагер тёмное", "мл", 3),
    BEER_MEXICAN("пиво мексиканское","мл", 4),
    BEER_CIDER("сидр","мл", 5),
    BEER_STOUT("пиво стаут", "мл", 6);

    private final String type;
    private final String unit;
    private final int ordinal;

    BeerType(String type, String unit, int ordinal) {
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
        for (BeerType value : BeerType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
