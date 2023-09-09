package app.enums.component_types;

public enum WhiskeyType implements ComponentType {
    WHISKEY_SCOTCH("виски скотч","мл", 0),
    WHISKEY_IRISH("виски ирландский","мл", 1),
    WHISKEY_BOURBON("виски бурбон","мл", 2),
    WHISKEY_TENNESSEE("виски теннесси","мл", 3);

    private final String type;
    private final String unit;
    private final int ordinal;

    WhiskeyType(String type, String unit, int ordinal) {
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
        for (WhiskeyType value : WhiskeyType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
