package app.enums.component_types;

public enum SodaType implements ComponentType {
    SODA_LEMONADE("лимонад","мл"),
    SODA_GINGERALE("имбирный эль","мл"),
    SODA_GINGERBEER("имбирное пиво","мл"),
    SODA_COLA("кола","мл"),
    SODA_SPRITE("спрайт","мл"),
    SODA_FANTA("фанта","мл"),
    SODA_TARRAGON("тархун","мл"),
    SODA_TONIC("тоник","мл"),
    SODA_SIMPLE("простая содовая","мл"),
    SODA_MINERAL("минералка","мл");

    private final String type;
    private final String unit;

    SodaType(String type, String unit) {
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
        for (SodaType value : SodaType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
