package app.enums.component_types;

public enum SyrupType implements ComponentType {
    SYRUP_SIMPLE("сироп сахарный 1:1","мл"),
    SYRUP_RICH("сироп сахарный 2:1","мл"),
    SYRUP_GRENADINE("сироп гренадин","мл"),
    SYRUP_VANILLA("сироп ванильный","мл"),
    SYRUP_COCONUT("сироп кокосовый крем","мл"),
    SYRUP_CHOCO("сироп шоколадный","мл"),
    SYRUP_MAPLE("сироп кленовый","мл"),
    SYRUP_CINNAMON("сироп коричный","мл"),
    SYRUP_MINT("сироп мятный","мл"),
    SYRUP_AGAVE("сироп агавы","мл");

    private final String type;
    private final String unit;

    SyrupType(String type, String unit) {
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
        for (SyrupType value : SyrupType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
