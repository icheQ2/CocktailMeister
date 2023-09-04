package app.enums.component_types;

public enum LiquorType implements ComponentType {
    LIQUOR_TRIPLESEC("ликёр трипл сек","мл"),
    LIQUOR_CASSIS("ликёр крем де кассис","мл"),
    LIQUOR_COCONUT("ликёр кокосовый", "мл");

    private final String type;
    private final String unit;

    LiquorType(String type, String unit) {
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
        for (LiquorType value : LiquorType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
