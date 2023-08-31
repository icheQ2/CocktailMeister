package main.java.app;

import main.java.app.enums.Operation;

import java.io.IOException;

public class Bar {
    public static void main(String[] args) {

        UserBar userBar = new UserBar("Dima", 123L);


        Operation operation = null;

        do {
            try {
                operation = askOperation();
                OperationExecutor.execute(operation, userBar);
            } catch (Exception e) {
                ConsoleHelper.writeMessage("ПРОИЗОШЛА ОШИБКА:");
                e.printStackTrace();
            }
        } while (operation != Operation.APP_EXIT);
    }

    public static Operation askOperation() throws IOException {

        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Выберите нужный пункт меню:");

        ConsoleHelper.writeMessage(String.format("\t %d - %s",
                Operation.SHELF_OVERVIEW.ordinal(), Operation.SHELF_OVERVIEW.getFunction()));
        ConsoleHelper.writeMessage(String.format("\t %d - %s",
                Operation.SHELF_ADD.ordinal(), Operation.SHELF_ADD.getFunction()));
        ConsoleHelper.writeMessage(String.format("\t %d - %s",
                Operation.SHELF_EDIT.ordinal(), Operation.SHELF_EDIT.getFunction()));
        ConsoleHelper.writeMessage(String.format("\t %d - %s",
                Operation.COCKTAIL_SUGGEST.ordinal(), Operation.COCKTAIL_SUGGEST.getFunction()));
        ConsoleHelper.writeMessage(String.format("\t %d - %s",
                Operation.COCKTAIL_ADD.ordinal(), Operation.COCKTAIL_ADD.getFunction()));
        ConsoleHelper.writeMessage(String.format("\t %d - %s",
                Operation.COCKTAIL_EDIT.ordinal(), Operation.COCKTAIL_EDIT.getFunction()));
        ConsoleHelper.writeMessage(String.format("\t %d - %s",
                Operation.APP_EXIT.ordinal(), Operation.APP_EXIT.getFunction()));

        return Operation.values()[ConsoleHelper.readInt()];
    }
}