package app.enums.component_types;

public enum JuiceType implements ComponentType {
    JUICE_ORANGE("сок апельсиновый","мл"),
    JUICE_APPLE("сок яблочный","мл"),
    JUICE_POMEGRANATE("сок гранатовый","мл"),
    JUICE_PINEAPPLE("сок ананасовый","мл"),
    JUICE_CRANBERRY("сок клюквенный","мл"),
    JUICE_GRAPEFRUIT("сок грейпфрутовый","мл"),
    JUICE_BERRY("ягодный морс","мл"),
    JUICE_TOMATO("сок томатный","мл");

    private final String type;
    private final String unit;

    JuiceType(String type, String unit) {
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
        for (JuiceType value : JuiceType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
