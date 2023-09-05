package app.views;

import app.ConsoleHelper;
import app.controllers.ReceiptController;
import app.models.Receipt;

import java.util.List;

public class ReceiptSuggest {
    public static void execute() throws Exception {
        List<Receipt> receipts = ReceiptController.showAll();
        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Поиск рецепта");
        ConsoleHelper.writeMessage("");
        if (receipts.isEmpty()) {
            ConsoleHelper.writeMessage("Список рецептов пустой(((");
        } else {
            ConsoleHelper.writeMessage("Выбери коктейль:");
            for (int i = 0; i < receipts.size(); i++) {
                ConsoleHelper.writeMessage(String.format("\t %d - %s", i, receipts.get(i).toShortString()));
            }
            Receipt receipt = receipts.get(ConsoleHelper.readInt());
            ConsoleHelper.writeMessage("");
            ConsoleHelper.writeMessage(receipt.toString());
        }

        //ДОБАВИТЬ ГОТОВКУ КОКТЕЙЛЯ, ВЫБОР ИНГРИДИЕНТОВ ИЗ СПИСКА И ИХ УБАВЛЕНИЕ ПОСЛЕ ПРИГОТОВКИ
    }
}
