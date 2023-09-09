package app.enums.component_types;

public enum SpiceType implements ComponentType {
    SPICE_NUTMEG("мускатный орех","гр", 0),
    SPICE_SPICESALT("соль со специями","гр", 1),
    SPICE_SALT("соль","гр", 2),
    SPICE_MINT("листья мяты","шт", 3),
    SPICE_SUGAR("сахарный песок","гр", 4),
    SPICE_CINNAMON("корица","мл", 5),
    SPICE_ACTIVATEDCOAL("активированный уголь","гр", 6),
    SPICE_FRESHBASIL("базилик свежий","гр", 7);

    private final String type;
    private final String unit;
    private final int ordinal;

    SpiceType(String type, String unit, int ordinal) {
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
        for (SpiceType value : SpiceType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
