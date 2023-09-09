package app.enums.component_types;

public enum LiquorType implements ComponentType {
    LIQUOR_TRIPLESEC("ликёр трипл сек","мл", 0),
    LIQUOR_CASSIS("ликёр крем де кассис","мл", 1),
    LIQUOR_COCONUT("ликёр кокосовый", "мл", 2),
    LIQUOR_ABSINTHE("абсент", "мл", 3),
    LIQUOR_SAMBUKA("самбука", "мл", 4),
    LIQUOR_BITTER("биттер-ликёр", "мл", 5),
    LIQUOR_HONEY("ликёр медовый", "мл", 6),
    LIQUOR_COFFEE("ликёр кофейный", "мл", 7),
    LIQUOR_CACAO("ликёр какао", "мл", 8),
    LIQUOR_MELON("ликёр дынный", "мл", 9),
    LIQUOR_AMARO("ликёр амаро", "мл", 10),
    LIQUOR_ALMOND("ликёр миндальный", "мл", 11),
    LIQUOR_BANANA("ликёр банановый", "мл", 12),
    LIQUOR_STRAWBERRY("ликёр клубничный", "мл", 13),
    LIQUOR_BLUECURACAO("ликёр блю кюрасао", "мл", 14),
    LIQUOR_SOURAPPLE("ликёр кислое яблоко", "мл", 15),
    LIQUOR_WHISKEYCINNAMON("коричный виски-ликёр", "мл", 16),
    LIQUOR_PEACH("ликёр персиковый", "мл", 17),
    LIQUOR_CHERRYBRANDY("ликёр черри бренди", "мл", 18),
    LIQUOR_PASSIONFRUIT("ликёр маракуйя", "мл", 19),
    LIQUOR_IRISHCREAM("ликёр айриш крим", "мл", 20),
    LIQUOR_BLACKBERRY("ликёр ежевичный", "мл", 21),
    LIQUOR_EGG("ликёр яичный", "мл", 22),
    LIQUOR_ELDERBERRY("ликёр бузины", "мл", 23),
    BITTER_HERBAL("ликёр травяной","мл", 24),
    BITTER_APERITIF("ликёр аперитив","мл", 25);

    private final String type;
    private final String unit;
    private final int ordinal;

    LiquorType(String type, String unit, int ordinal) {
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
        for (LiquorType value : LiquorType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
