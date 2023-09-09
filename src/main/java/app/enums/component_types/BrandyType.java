package app.enums.component_types;

public enum BrandyType implements ComponentType {
    BRANDY_BRANDY("бренди","мл", 0),
    BRANDY_COGNAC("коньяк", "мл", 1);

    private final String type;
    private final String unit;
    private final int ordinal;

    BrandyType(String type, String unit, int ordinal) {
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
        for (BrandyType value : BrandyType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
