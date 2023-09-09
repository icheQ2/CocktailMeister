package app.enums.component_types;

public enum DecorationType implements ComponentType {
    DECORATION_PINEAPPLELEAF("листик ананаса","шт", 0),
    DECORATION_ORANGEPEEL("цедра апельсина","шт", 1),
    DECORATION_MINT("листья мяты","шт", 2);

    private final String type;
    private final String unit;
    private final int ordinal;

    DecorationType(String type, String unit, int ordinal) {
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
        for (DecorationType value : DecorationType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
