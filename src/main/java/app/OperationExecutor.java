package app;

import app.enums.Operation;
import app.views.ShelfShow;
import app.views.ComponentAdd;
import app.views.ComponentEdit;

public class OperationExecutor {

    public static void execute(Operation operation, User user) throws Exception {
        switch (operation) {
            case SHELF_OVERVIEW:
                ShelfShow.execute(user);
                break;
            case SHELF_ADD:
                ComponentAdd.execute(user);
                break;
            case SHELF_EDIT:
                ComponentEdit.execute(user);
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
