package app.enums.component_types;

public enum FruitType implements ComponentType {
    FRUIT_FROZENPINEAPPLE("замороженный ананас","гр", 0),
    FRUIT_PASSIONFRUIT("пюре маракуйя","гр", 1);

    private final String type;
    private final String unit;
    private final int ordinal;

    FruitType(String type, String unit, int ordinal) {
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
        for (FruitType value : FruitType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
