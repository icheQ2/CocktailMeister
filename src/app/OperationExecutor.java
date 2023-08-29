package app;

public class OperationExecutor {

    public static void execute(Operation operation, UserBar userBar) throws Exception {
        switch (operation) {
            case SHELF_OVERVIEW:
                userBar.shelfOverview();
                break;
            case SHELF_ADD:
                userBar.shelfAdd();
                break;
            case SHELF_EDIT:
                break;
            case COCKTAIL_SUGGEST:
                break;
            case COCKTAIL_ADD:
                break;
            case COCKTAIL_EDIT:
                break;
            case APP_EXIT:
                ConsoleHelper.writeMessage("До встречи!");
                break;
            default:
                ConsoleHelper.writeMessage("НЕИЗВЕСТНАЯ КОМАНДА!");
        }
    }
}
