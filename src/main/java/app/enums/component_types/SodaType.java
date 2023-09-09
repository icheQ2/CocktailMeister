package app.enums.component_types;

public enum SodaType implements ComponentType {
    SODA_LEMONADE("лимонад","мл", 0),
    SODA_GINGERALE("имбирный эль","мл", 1),
    SODA_GINGERBEER("имбирное пиво","мл", 2),
    SODA_COLA("кола","мл", 3),
    SODA_SPRITE("спрайт","мл", 4),
    SODA_FANTA("фанта","мл", 5),
    SODA_TARRAGON("тархун","мл", 6),
    SODA_TONIC("тоник","мл", 7),
    SODA_SIMPLE("простая содовая","мл", 8),
    SODA_MINERAL("минералка","мл", 9);

    private final String type;
    private final String unit;
    private final int ordinal;

    SodaType(String type, String unit, int ordinal) {
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
        for (SodaType value : SodaType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
