package app.enums.component_types;

public enum SyrupType implements ComponentType {
    SYRUP_SIMPLE("сироп сахарный 1:1","мл", 0),
    SYRUP_RICH("сироп сахарный 2:1","мл", 1),
    SYRUP_GRENADINE("сироп гренадин","мл", 2),
    SYRUP_VANILLA("сироп ванильный","мл", 3),
    SYRUP_COCONUT("сироп кокосовый крем","мл", 4),
    SYRUP_CHOCO("сироп шоколадный","мл", 5),
    SYRUP_MAPLE("сироп кленовый","мл", 6),
    SYRUP_CINNAMON("сироп коричный","мл", 7),
    SYRUP_MINT("сироп мятный","мл", 8),
    SYRUP_AGAVE("сироп агавы","мл", 9);

    private final String type;
    private final String unit;
    private final int ordinal;

    SyrupType(String type, String unit, int ordinal) {
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
        for (SyrupType value : SyrupType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
