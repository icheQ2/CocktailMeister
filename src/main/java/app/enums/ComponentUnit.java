package app.enums;

public enum ComponentUnit {
    ML("мл"),
    GR("гр"),
    OZ("унц"),
    PC("шт"),
    TSP("чл");

    private final String unit;

    ComponentUnit(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public static String getValues() {
        String values = "";
        for (ComponentUnit value : ComponentUnit.values()) {
            values += String.format(", %d - %s", value.ordinal(), value);
        }
        return values.substring(2);
    }
}
