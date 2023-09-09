package app.enums.component_types;

public enum BitterType implements ComponentType {
    BITTER_ANGOSTURA("биттер травяной","мл", 0),
    BITTER_ORANGE("биттер апельсиновый","мл", 1);

    private final String type;
    private final String unit;
    private final int ordinal;

    BitterType(String type, String unit, int ordinal) {
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
        for (BitterType value : BitterType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
