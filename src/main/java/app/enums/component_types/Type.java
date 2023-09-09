package app.enums.component_types;

import app.ConsoleHelper;

import java.io.IOException;

public enum Type implements ComponentType {
    GIN("джин", "мл", 0),
    RUM("ром", "мл", 1),
    WHISKEY("виски", "мл", 2),
    TEQUILA("текила", "мл", 3),
    VODKA("водка", "мл", 4),
    BRANDY("бренди", "мл", 5),
    LIQUOR("ликёр", "мл", 6),
    BEER("пиво", "мл", 7),
    VERMOUTH("вермут", "мл", 8),
    WINE("вино", "мл", 9),
    SODA("газировка", "мл", 10),
    JUICE("сок", "мл", 11),
    FRESH("фреш", "мл", 12),
    SYRUP("сироп", "мл", 13),
    BITTER("биттер", "мл", 14),
    SAUCE("соус", "мл", 15),
    CREAM("сливки/яйцо", "мл", 16),
    LIQUID("прочий напиток", "мл", 17),
    SPICE("специя/добавка", "гр", 18),
    FRUIT("фрукт", "гр", 19),
    DECORATION("украшение", "шт", 20),
    ICE("лёд", "ед", 21);

    private final String type;
    private final String unit;
    private final int ordinal;

    Type(String type, String unit, int ordinal) {
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
        for (Type value : Type.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }

    public static ComponentType getSubType(Type type, int subType) throws IOException {
        String format = "Выбери подтип (%s):";
        switch (type) {
            case GIN:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, GinType.getValues()));
                    return GinType.values()[ConsoleHelper.readInt()];
                } else {
                    return GinType.values()[subType];
                }
            case RUM:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, RumType.getValues()));
                    return RumType.values()[ConsoleHelper.readInt()];
                } else {
                    return RumType.values()[subType];
                }
            case WHISKEY:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, WhiskeyType.getValues()));
                    return WhiskeyType.values()[ConsoleHelper.readInt()];
                } else {
                    return WhiskeyType.values()[subType];
                }
            case TEQUILA:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, TequilaType.getValues()));
                    return TequilaType.values()[ConsoleHelper.readInt()];
                } else {
                    return TequilaType.values()[subType];
                }
            case VODKA:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, VodkaType.getValues()));
                    return VodkaType.values()[ConsoleHelper.readInt()];
                } else {
                    return VodkaType.values()[subType];
                }
            case BRANDY:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, BrandyType.getValues()));
                    return BrandyType.values()[ConsoleHelper.readInt()];
                } else {
                    return BrandyType.values()[subType];
                }
            case LIQUOR:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, LiquorType.getValues()));
                    return LiquorType.values()[ConsoleHelper.readInt()];
                } else {
                    return LiquorType.values()[subType];
                }
            case BEER:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, BeerType.getValues()));
                    return BeerType.values()[ConsoleHelper.readInt()];
                } else {
                    return BeerType.values()[subType];
                }
            case VERMOUTH:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, VermouthType.getValues()));
                    return VermouthType.values()[ConsoleHelper.readInt()];
                } else {
                    return VermouthType.values()[subType];
                }
            case WINE:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, WineType.getValues()));
                    return WineType.values()[ConsoleHelper.readInt()];
                } else {
                    return WineType.values()[subType];
                }
            case SODA:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, SodaType.getValues()));
                    return SodaType.values()[ConsoleHelper.readInt()];
                } else {
                    return SodaType.values()[subType];
                }
            case JUICE:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, JuiceType.getValues()));
                    return JuiceType.values()[ConsoleHelper.readInt()];
                } else {
                    return JuiceType.values()[subType];
                }
            case FRESH:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, FreshType.getValues()));
                    return FreshType.values()[ConsoleHelper.readInt()];
                } else {
                    return FreshType.values()[subType];
                }
            case SYRUP:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, SyrupType.getValues()));
                    return SyrupType.values()[ConsoleHelper.readInt()];
                } else {
                    return SyrupType.values()[subType];
                }
            case BITTER:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, BitterType.getValues()));
                    return BitterType.values()[ConsoleHelper.readInt()];
                } else {
                    return BitterType.values()[subType];
                }
            case SAUCE:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, SauceType.getValues()));
                    return SauceType.values()[ConsoleHelper.readInt()];
                } else {
                    return SauceType.values()[subType];
                }
            case CREAM:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, CreamType.getValues()));
                    return CreamType.values()[ConsoleHelper.readInt()];
                } else {
                    return CreamType.values()[subType];
                }
            case LIQUID:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, LiquidType.getValues()));
                    return LiquidType.values()[ConsoleHelper.readInt()];
                } else {
                    return LiquidType.values()[subType];
                }
            case SPICE:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, SpiceType.getValues()));
                    return SpiceType.values()[ConsoleHelper.readInt()];
                } else {
                    return SpiceType.values()[subType];
                }
            case FRUIT:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, FruitType.getValues()));
                    return FruitType.values()[ConsoleHelper.readInt()];
                } else {
                    return FruitType.values()[subType];
                }
            case DECORATION:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, DecorationType.getValues()));
                    return DecorationType.values()[ConsoleHelper.readInt()];
                } else {
                    return DecorationType.values()[subType];
                }
            case ICE:
                if (subType == -1) {
                    ConsoleHelper.writeMessage(String.format(format, IceType.getValues()));
                    return IceType.values()[ConsoleHelper.readInt()];
                } else {
                    return IceType.values()[subType];
                }
            default:
                return null;
        }
    }
}
