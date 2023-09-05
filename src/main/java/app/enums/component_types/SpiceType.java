package app.enums.component_types;

public enum SpiceType implements ComponentType {
    SPICE_NUTMEG("мускатный орех","гр"),
    SPICE_SPICESALT("соль со специями","гр"),
    SPICE_SALT("соль","гр"),
    SPICE_MINT("листья мяты","шт"),
    SPICE_SUGAR("сахарный песок","гр"),
    SPICE_CINNAMON("корица","мл"),
    SPICE_ACTIVATEDCOAL("активированный уголь","гр"),
    SPICE_FRESHBASIL("базилик свежий","гр");

    private final String type;
    private final String unit;

    SpiceType(String type, String unit) {
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
        for (SpiceType value : SpiceType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
