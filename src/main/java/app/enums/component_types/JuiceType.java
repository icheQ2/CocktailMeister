package app.enums.component_types;

public enum JuiceType implements ComponentType {
    JUICE_ORANGE("сок апельсиновый","мл", 0),
    JUICE_APPLE("сок яблочный","мл", 1),
    JUICE_POMEGRANATE("сок гранатовый","мл", 2),
    JUICE_PINEAPPLE("сок ананасовый","мл", 3),
    JUICE_CRANBERRY("сок клюквенный","мл", 4),
    JUICE_GRAPEFRUIT("сок грейпфрутовый","мл", 5),
    JUICE_BERRY("ягодный морс","мл", 6),
    JUICE_TOMATO("сок томатный","мл", 7);

    private final String type;
    private final String unit;
    private final int ordinal;

    JuiceType(String type, String unit, int ordinal) {
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
        for (JuiceType value : JuiceType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
