package app.enums.component_types;

public enum DecorationType implements ComponentType {
    DECORATION_PINEAPPLELEAF("листик ананаса","шт"),
    DECORATION_ORANGEPEEL("цедра апельсина","шт"),
    DECORATION_MINT("листья мяты","шт");

    private final String type;
    private final String unit;

    DecorationType(String type, String unit) {
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
        for (DecorationType value : DecorationType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
