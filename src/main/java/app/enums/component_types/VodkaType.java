package app.enums.component_types;

public enum VodkaType implements ComponentType {
    VODKA_REGULAR("водка обычная","мл"),
    VODKA_VANILLA("водка ванильная","мл");

    private final String type;
    private final String unit;

    VodkaType(String type, String unit) {
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
        for (VodkaType value : VodkaType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
