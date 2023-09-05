package app.enums.component_types;

public enum FruitType implements ComponentType {
    FRUIT_FROZENPINEAPPLE("замороженный ананас","гр"),
    FRUIT_PASSIONFRUIT("пюре маракуйя","гр");

    private final String type;
    private final String unit;

    FruitType(String type, String unit) {
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
        for (FruitType value : FruitType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
