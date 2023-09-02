package app.enums;

public enum PreparationMethod {
    SHAKE("шейк"),
    BUILD("билд"),
    STIR("стир"),
    DRY_STIR("сухой стир"),
    MUDDL("мадл"),
    LAYERS("слоями"),
    IGNITE("поджечь");

    private final String method;

    PreparationMethod(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }

    public static String getValues() {
        String values = "";
        for (PreparationMethod value : PreparationMethod.values()) {
            values += String.format(", %d - %s", value.ordinal(), value);
        }
        return values.substring(2);
    }
}
