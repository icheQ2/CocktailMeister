package app;

import app.enums.Operation;
import app.views.*;

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
            case RECEIPT_SUGGEST:
                ReceiptSuggest.execute();
                break;
            case RECEIPT_ADD:
                ReceiptAdd.execute();
                break;
            case RECEIPT_EDIT:
                ReceiptEdit.execute();
                break;
            case APP_EXIT:
                ConsoleHelper.writeMessage("До встречи!");
                break;
            default:
                ConsoleHelper.writeMessage("НЕИЗВЕСТНАЯ КОМАНДА!");
        }
    }
}
