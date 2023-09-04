package app.enums.component_types;

public enum CreamType implements ComponentType {
    CREAM_LIGHT("сливки 10%","мл"),
    CREAM_MEDIUM("сливки 20%","мл"),
    CREAM_FAT("сливки 30%","мл"),
    CREAM_MILK("молоко","мл");

    private final String type;
    private final String unit;

    CreamType(String type, String unit) {
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
        for (CreamType value : CreamType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
