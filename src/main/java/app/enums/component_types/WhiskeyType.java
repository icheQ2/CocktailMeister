package app.enums.component_types;

public enum WhiskeyType implements ComponentType {
    WHISKEY_SCOTCH("виски скотч","мл"),
    WHISKEY_IRISH("виски ирландский","мл"),
    WHISKEY_BOURBON("виски бурбон","мл"),
    WHISKEY_TENNESSEE("виски теннесси","мл");

    private final String type;
    private final String unit;

    WhiskeyType(String type, String unit) {
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
        for (WhiskeyType value : WhiskeyType.values()) {
            values += String.format(", %d - %s", value.ordinal(), value.getType());
        }
        return values.substring(2);
    }
}
