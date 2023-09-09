package app.enums;

public enum PreparationMethod {
    SHAKE("шейк", 0),
    BUILD("билд", 1),
    STIR("стир", 2),
    DRY_STIR("сухой стир", 3),
    MUDDL("мадл", 4),
    LAYERS("слоями", 5),
    IGNITE("поджечь", 6),
    BLEND("бленд", 7);

    private final String method;
    private final int ordinal;

    PreparationMethod(String method, int ordinal) {
        this.method = method;
        this.ordinal = ordinal;
    }

    public String getMethod() {
        return method;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public static String getValues() {
        String values = "";
        for (PreparationMethod value : PreparationMethod.values()) {
            values += String.format(", %d - %s", value.ordinal(), value);
        }
        return values.substring(2);
    }
}
