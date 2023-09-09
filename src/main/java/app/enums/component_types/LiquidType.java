package app.enums.component_types;

public enum LiquidType implements ComponentType {
    LIQUID_ENERGY("энергетик","мл", 0),
    LIQUID_ESPRESSO("кофе эспрессо","мл", 1),
    LIQUID_WATER("вода","мл", 2),
    LIQUID_KOMBUCHA("комбуча","мл", 3);

    private final String type;
    private final String unit;
    private final int ordinal;

    LiquidType(String type, String unit, int ordinal) {
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
        for (LiquidType value : LiquidType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
