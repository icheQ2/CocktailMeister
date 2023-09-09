package app.enums.component_types;

public enum TequilaType implements ComponentType {
    TEQUILA_SILVER("текила серебряная","мл", 0),
    TEQUILA_GOLD("текила золотая","мл", 1),
    TEQUILA_BLANCO("текила бланко","мл", 2),
    TEQUILA_REPOSADO("текила репосадо","мл", 3),
    TEQUILA_ANEJO("текила аньехо","мл", 4),
    TEQUILA_EXTRAANEJO("текила экстра-аньехо","мл", 5);

    private final String type;
    private final String unit;
    private final int ordinal;

    TequilaType(String type, String unit, int ordinal) {
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
        for (TequilaType value : TequilaType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
