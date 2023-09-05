package app.enums.component_types;

public enum LiquorType implements ComponentType {
    LIQUOR_TRIPLESEC("ликёр трипл сек","мл"),
    LIQUOR_CASSIS("ликёр крем де кассис","мл"),
    LIQUOR_COCONUT("ликёр кокосовый", "мл"),
    LIQUOR_ABSINTHE("абсент", "мл"),
    LIQUOR_SAMBUKA("самбука", "мл"),
    LIQUOR_BITTER("биттер-ликёр", "мл"),
    LIQUOR_HONEY("ликёр медовый", "мл"),
    LIQUOR_COFFEE("ликёр кофейный", "мл"),
    LIQUOR_CACAO("ликёр какао", "мл"),
    LIQUOR_MELON("ликёр дынный", "мл"),
    LIQUOR_AMARO("ликёр амаро", "мл"),
    LIQUOR_ALMOND("ликёр миндальный", "мл"),
    LIQUOR_BANANA("ликёр банановый", "мл"),
    LIQUOR_STRAWBERRY("ликёр клубничный", "мл"),
    LIQUOR_BLUECURACAO("ликёр блю кюрасао", "мл"),
    LIQUOR_SOURAPPLE("ликёр кислое яблоко", "мл"),
    LIQUOR_WHISKEYCINNAMON("коричный виски-ликёр", "мл"),
    LIQUOR_PEACH("ликёр персиковый", "мл"),
    LIQUOR_CHERRYBRANDY("ликёр черри бренди", "мл"),
    LIQUOR_PASSIONFRUIT("ликёр маракуйя", "мл"),
    LIQUOR_IRISHCREAM("ликёр айриш крим", "мл"),
    LIQUOR_BLACKBERRY("ликёр ежевичный", "мл"),
    LIQUOR_EGG("ликёр яичный", "мл"),
    LIQUOR_ELDERBERRY("ликёр бузины", "мл"),
    BITTER_HERBAL("ликёр травяной","мл");

    private final String type;
    private final String unit;

    LiquorType(String type, String unit) {
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
        for (LiquorType value : LiquorType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
