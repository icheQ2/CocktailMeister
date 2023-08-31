package main.java.app.enums;

public enum ComponentType {
    GIN("джин"),
    RUM("ром"),
    WHISKEY("виски"),
    TEQUILA("текила"),
    VODKA("водка"),
    BRANDY("бренди"),
    LIQUOR("ликёр"),
    BEER("пиво"),
    WINE("вино"),
    SYRUP("сироп"),
    JUICE("сок"),
    FRESH("фреш"),
    ICE("лёд");

    private final String type;

    ComponentType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static String getValues() {
        String values = "";
        for (ComponentType value : ComponentType.values()) {
            values += ", " + value;
        }
        return values.substring(2);
    }
}