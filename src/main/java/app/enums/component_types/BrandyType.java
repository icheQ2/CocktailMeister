package app.enums.component_types;

public enum BrandyType implements ComponentType {
    BRANDY_BRANDY("бренди","мл"),
    BRANDY_COGNAC("коньяк", "мл");

    private final String type;
    private final String unit;

    BrandyType(String type, String unit) {
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
        for (BrandyType value : BrandyType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
