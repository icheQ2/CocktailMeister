public enum ComponentUnits {
    ML("мл"),
    GR("гр"),
    OZ("унц"),
    PC("шт"),
    TSP("чл");

    private final String unit;

    ComponentUnits(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }
}
