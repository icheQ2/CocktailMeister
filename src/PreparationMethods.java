public enum PreparationMethods {
    SHAKE("шейк"),
    BUILD("билд"),
    STIR("стир"),
    DRY_STIR("сухой стир"),
    MUDDL("мадл"),
    LAYERS("слоями"),
    IGNITE("поджечь");

    private final String method;

    PreparationMethods(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }
}
