package app.enums.component_types;

public enum CreamType implements ComponentType {
    CREAM_LIGHT("сливки 10%","мл", 0),
    CREAM_MEDIUM("сливки 20%","мл", 1),
    CREAM_FAT("сливки 30%","мл", 2),
    CREAM_WHIPPED("сливки взбитые","мл", 3),
    CREAM_MILK("молоко","мл", 4),
    CREAM_EGGWHITE("яичный белок","мл", 5),
    CREAM_COCONUT("молоко кокосовое","мл", 6);

    private final String type;
    private final String unit;
    private final int ordinal;

    CreamType(String type, String unit, int ordinal) {
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
        for (CreamType value : CreamType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
