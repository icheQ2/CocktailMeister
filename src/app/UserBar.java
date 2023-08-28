package app;

import app.components.Component;
import app.components.ComponentType;
import app.components.ComponentUnit;
import app.shelf.UserShelf;

import java.io.IOException;
import java.util.List;

public class UserBar {
    private String userName;
    private long userId;
    private UserShelf shelf;

    public UserBar(String userName, long userId) {
        this.userName = userName;
        this.userId = userId;
        this.shelf = new UserShelf(userName, userId);
        shelf.addComponent(new Component("Campari", "Campari", ComponentType.LIQUOR, ComponentUnit.ML, 1000 / 700, 700, "qq")); // УДАЛИТЬ
        shelf.addComponent(new Component("Barrister", "Sloe", ComponentType.GIN, ComponentUnit.ML, 2000 / 1000, 1000, "bb")); // УДАЛИТЬ
    }
    public void shelfOverview() {
        List<Component> components = shelf.getComponents();
        ConsoleHelper.writeMessage("");
        if (components.isEmpty()) {
            ConsoleHelper.writeMessage("Бар пользователя " + userName + " пустой(((");
        } else {
            ConsoleHelper.writeMessage("Бар пользователя " + userName);
            ConsoleHelper.writeMessage("общей стоимостью " + shelf.getTotalValue() + " рублей");
            ConsoleHelper.writeMessage("состоит из:");
            ConsoleHelper.writeMessage("");
            for (Component component : components) {
                ConsoleHelper.writeMessage(component.toString());
            }
        }
    }

    public void shelfAdd() throws IOException { // Дописать сложение и выбор из существующих бутылок
        String TEST = "TEST";
        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Введи бренд:");
        String brand = ConsoleHelper.readString();
        ConsoleHelper.writeMessage("Введи название продукта:");
        String name = ConsoleHelper.readString();
        ConsoleHelper.writeMessage(String.format("Выбери тип (%s):", TEST)); // Заменить заглушку списком типов
        ComponentType type = ComponentType.valueOf(ConsoleHelper.readString());
        ConsoleHelper.writeMessage(String.format("Выбери единицы измерения (%s):", TEST)); // Заменить заглушку списком единиц
        ComponentUnit unit = ComponentUnit.valueOf(ConsoleHelper.readString());
        ConsoleHelper.writeMessage("Введи стоимость:");
        double cost = ConsoleHelper.readDouble();
        ConsoleHelper.writeMessage("Введи объём:");
        double volume = ConsoleHelper.readDouble();
        ConsoleHelper.writeMessage("Введи примечание:");
        String comment = ConsoleHelper.readString();
        shelf.addComponent(new Component(name, brand, type, unit, cost / volume, volume, comment));
    }
}
