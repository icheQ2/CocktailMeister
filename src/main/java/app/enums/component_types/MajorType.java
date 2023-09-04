package app.enums.component_types;

import app.ConsoleHelper;

public enum MajorType implements ComponentType {
    GIN("джин", "мл"),
    RUM("ром", "мл"),
    WHISKEY("виски", "мл"),
    TEQUILA("текила", "мл"),
    VODKA("водка", "мл"),
    BRANDY("бренди", "мл"),
    LIQUOR("ликёр", "мл"),
    BEER("пиво", "мл"),
    WINE("вино", "мл"),
    SODA("газировка", "мл"),
    JUICE("сок", "мл"),
    FRESH("фреш", "мл"),
    SYRUP("сироп", "мл"),
    SAUCE("соус", "мл"),
    CREAM("сливки", "мл"),
    SPICE("специя", "гр"),
    DECORATION("украшение", "шт"),
    ICE("лёд", "ед");

    private final String type;
    private final String unit;

    MajorType(String type, String unit) {
        this.type = type;
        this.unit = unit;
    }

    public String getType() {
        return type;
    }
    public String getUnit() {
        return unit;
    }

    public static String getValues() {
        String values = "";
        for (MajorType value : MajorType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }

    public static ComponentType getSubType(MajorType type) throws Exception {
        String format = "Выбери подтип (%s):";
        switch (type) {
            case GIN:
                ConsoleHelper.writeMessage(String.format(format, GinType.getValues()));
                return GinType.values()[ConsoleHelper.readInt()];
            case RUM:
                ConsoleHelper.writeMessage(String.format(format, RumType.getValues()));
                return RumType.values()[ConsoleHelper.readInt()];
            case WHISKEY:
                ConsoleHelper.writeMessage(String.format(format, WhiskeyType.getValues()));
                return WhiskeyType.values()[ConsoleHelper.readInt()];
            case TEQUILA:
                ConsoleHelper.writeMessage(String.format(format, TequilaType.getValues()));
                return TequilaType.values()[ConsoleHelper.readInt()];
            case VODKA:
                ConsoleHelper.writeMessage(String.format(format, VodkaType.getValues()));
                return VodkaType.values()[ConsoleHelper.readInt()];
            case BRANDY:
                ConsoleHelper.writeMessage(String.format(format, BrandyType.getValues()));
                return BrandyType.values()[ConsoleHelper.readInt()];
            case LIQUOR:
                ConsoleHelper.writeMessage(String.format(format, LiquorType.getValues()));
                return LiquorType.values()[ConsoleHelper.readInt()];
            case BEER:
                ConsoleHelper.writeMessage(String.format(format, BeerType.getValues()));
                return BeerType.values()[ConsoleHelper.readInt()];
            case WINE:
                ConsoleHelper.writeMessage(String.format(format, WineType.getValues()));
                return WineType.values()[ConsoleHelper.readInt()];
            case SODA:
                ConsoleHelper.writeMessage(String.format(format, SodaType.getValues()));
                return SodaType.values()[ConsoleHelper.readInt()];
            case JUICE:
                ConsoleHelper.writeMessage(String.format(format, JuiceType.getValues()));
                return JuiceType.values()[ConsoleHelper.readInt()];
            case FRESH:
                ConsoleHelper.writeMessage(String.format(format, FreshType.getValues()));
                return FreshType.values()[ConsoleHelper.readInt()];
            case SYRUP:
                ConsoleHelper.writeMessage(String.format(format, SyrupType.getValues()));
                return SyrupType.values()[ConsoleHelper.readInt()];
            case SAUCE:
                ConsoleHelper.writeMessage(String.format(format, SauceType.getValues()));
                return SauceType.values()[ConsoleHelper.readInt()];
            case CREAM:
                ConsoleHelper.writeMessage(String.format(format, CreamType.getValues()));
                return CreamType.values()[ConsoleHelper.readInt()];
            case SPICE:
                ConsoleHelper.writeMessage(String.format(format, SpiceType.getValues()));
                return SpiceType.values()[ConsoleHelper.readInt()];
            case DECORATION:
                ConsoleHelper.writeMessage(String.format(format, DecorationType.getValues()));
                return DecorationType.values()[ConsoleHelper.readInt()];
            case ICE:
                ConsoleHelper.writeMessage(String.format(format, IceType.getValues()));
                return IceType.values()[ConsoleHelper.readInt()];
            default:
                return null;
        }
    }
}
