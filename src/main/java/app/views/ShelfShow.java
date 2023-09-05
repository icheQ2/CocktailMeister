package app.views;

import app.ConsoleHelper;
import app.User;
import app.controllers.ComponentController;
import app.controllers.ShelfController;
import app.models.Component;
import app.models.Shelf;

import java.util.List;

public class ShelfShow {
    public static void execute(User user) throws Exception {
        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Отображение бара пользователя");
        ConsoleHelper.writeMessage("");
        long userId = user.getUserId();
        String userName = user.getUserName();
        Shelf shelf = ShelfController.show(userId);
        List<Component> components = ComponentController.showAll(userId);
        double totalValue = 0;
        for (Component component : components) {
            totalValue += component.getTotalCost();
        }
        shelf.setTotalValue(totalValue);
        ShelfController.update(userId, shelf);
        ConsoleHelper.writeMessage("");
        if (components.isEmpty()) {
            ConsoleHelper.writeMessage(String.format("Бар пользователя %s пустой(((", userName));
        } else {
            ConsoleHelper.writeMessage(String.format("Бар пользователя %s", userName));
            ConsoleHelper.writeMessage(String.format("общей стоимостью %.2f рублей", shelf.getTotalValue()));
            ConsoleHelper.writeMessage("состоит из:");
            ConsoleHelper.writeMessage("");
            for (Component component : components) {
                ConsoleHelper.writeMessage(component.toString());
            }
        }
    }
}
