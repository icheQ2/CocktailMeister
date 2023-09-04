package app.enums;

public enum Operation {
    SHELF_OVERVIEW("осмотреть свой бар"),
    SHELF_ADD("дополнить свой бар"),
    SHELF_EDIT("изменить свой бар"),
    RECEIPT_SUGGEST("предложить коктейль"),
    RECEIPT_ADD("добавить новый коктейль в базу"),
    RECEIPT_EDIT("изменить рецепт коктейля в базе"),
    APP_EXIT("выйти из приложения");

    private final String function;

    Operation(String function) {
        this.function = function;
    }

    public String getFunction() {
        return function;
    }
}
