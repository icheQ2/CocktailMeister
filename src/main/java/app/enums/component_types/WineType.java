package app.enums.component_types;

public enum WineType implements ComponentType {
    WINE_REDDRY("вино красное сухое","мл"),
    WINE_REDSEMIDRY("вино красное полусухое","мл"),
    WINE_REDSEMISWEET("вино красное полусладкое","мл"),
    WINE_REDSWEET("вино красное сладкое","мл"),
    WINE_WHITEDRY("вино белое сухое","мл"),
    WINE_WHITESEMIDRY("вино белое полусухое","мл"),
    WINE_WHITESEMISWEET("вино белое полусладкое","мл"),
    WINE_WHITESWEET("вино белое сладкое","мл"),
    WINE_ROSEDRY("вино розовое сухое","мл"),
    WINE_ROSESEMIDRY("вино розовое полусухое","мл"),
    WINE_ROSESEMISWEET("вино розовое полусладкое","мл"),
    WINE_ROSESWEET("вино розовое сладкое","мл"),
    WINE_SPARKLING("вино игристое","мл");

    private final String type;
    private final String unit;

    WineType(String type, String unit) {
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
        for (WineType value : WineType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
