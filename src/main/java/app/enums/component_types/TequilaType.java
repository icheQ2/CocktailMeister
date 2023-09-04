package app.enums.component_types;

public enum TequilaType implements ComponentType {
    TEQUILA_SILVER("текила серебряная","мл"),
    TEQUILA_GOLD("текила золотая","мл"),
    TEQUILA_BLANCO("текила бланко","мл"),
    TEQUILA_REPOSADO("текила репосадо","мл"),
    TEQUILA_ANEJO("текила аньехо","мл"),
    TEQUILA_EXTRAANEJO("текила экстра-аньехо","мл");

    private final String type;
    private final String unit;

    TequilaType(String type, String unit) {
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
        for (TequilaType value : TequilaType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
