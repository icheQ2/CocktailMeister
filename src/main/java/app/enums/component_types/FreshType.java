package app.enums.component_types;

public enum FreshType implements ComponentType {
    FRESH_LIME("фреш лайма","мл"),
    FRESH_LEMON("фреш лимона","мл"),
    FRESH_ORANGE("фреш апельсина","мл"),
    FRESH_GRAPEFRUIT("фреш грейпфрута","мл");

    private final String type;
    private final String unit;

    FreshType(String type, String unit) {
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
        for (FreshType value : FreshType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
