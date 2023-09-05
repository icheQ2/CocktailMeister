package app.enums.component_types;

public enum LiquidType implements ComponentType {
    LIQUID_ENERGY("энергетик","мл"),
    LIQUID_ESPRESSO("кофе эспрессо","мл"),
    LIQUID_WATER("вода","мл"),
    LIQUID_KOMBUCHA("комбуча","мл");

    private final String type;
    private final String unit;

    LiquidType(String type, String unit) {
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
        for (LiquidType value : LiquidType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
