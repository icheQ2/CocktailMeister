package app;

import app.config.SpringConfig;
import app.enums.Operation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Bar {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        User user = new User("Dima", 123L);


        Operation operation = null;

        do {
            try {
                operation = askOperation();
                OperationExecutor.execute(operation, user);
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
                Operation.RECEIPT_SUGGEST.ordinal(), Operation.RECEIPT_SUGGEST.getFunction()));
        ConsoleHelper.writeMessage(String.format("\t %d - %s",
                Operation.RECEIPT_ADD.ordinal(), Operation.RECEIPT_ADD.getFunction()));
        ConsoleHelper.writeMessage(String.format("\t %d - %s",
                Operation.RECEIPT_EDIT.ordinal(), Operation.RECEIPT_EDIT.getFunction()));
        ConsoleHelper.writeMessage(String.format("\t %d - %s",
                Operation.APP_EXIT.ordinal(), Operation.APP_EXIT.getFunction()));

        return Operation.values()[ConsoleHelper.readInt()];
    }
}