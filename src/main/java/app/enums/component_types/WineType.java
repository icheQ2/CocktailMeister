package app.enums.component_types;

public enum WineType implements ComponentType {
    WINE_REDDRY("вино красное сухое","мл", 0),
    WINE_REDSEMIDRY("вино красное полусухое","мл", 1),
    WINE_REDSEMISWEET("вино красное полусладкое","мл", 2),
    WINE_REDSWEET("вино красное сладкое","мл", 3),
    WINE_WHITEDRY("вино белое сухое","мл", 4),
    WINE_WHITESEMIDRY("вино белое полусухое","мл", 5),
    WINE_WHITESEMISWEET("вино белое полусладкое","мл", 6),
    WINE_WHITESWEET("вино белое сладкое","мл", 7),
    WINE_ROSEDRY("вино розовое сухое","мл", 8),
    WINE_ROSESEMIDRY("вино розовое полусухое","мл", 9),
    WINE_ROSESEMISWEET("вино розовое полусладкое","мл", 10),
    WINE_ROSESWEET("вино розовое сладкое","мл", 11),
    WINE_SPARKLING("вино игристое","мл", 12);

    private final String type;
    private final String unit;
    private final int ordinal;

    WineType(String type, String unit, int ordinal) {
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
        for (WineType value : WineType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
