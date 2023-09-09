package app.enums.component_types;

public enum FreshType implements ComponentType {
    FRESH_LIME("фреш лайма","мл", 0),
    FRESH_LEMON("фреш лимона","мл", 1),
    FRESH_ORANGE("фреш апельсина","мл", 2),
    FRESH_GRAPEFRUIT("фреш грейпфрута","мл", 3);

    private final String type;
    private final String unit;
    private final int ordinal;

    FreshType(String type, String unit, int ordinal) {
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
        for (FreshType value : FreshType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
