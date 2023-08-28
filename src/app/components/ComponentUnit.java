package app.components;

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
}
