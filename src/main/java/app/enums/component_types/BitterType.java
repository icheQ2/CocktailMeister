package app.enums.component_types;

public enum BitterType implements ComponentType {
    BITTER_ANGOSTURA("биттер травяной","мл"),
    BITTER_ORANGE("биттер апельсиновый","мл");

    private final String type;
    private final String unit;

    BitterType(String type, String unit) {
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
        for (BitterType value : BitterType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
