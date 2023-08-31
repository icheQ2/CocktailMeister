package main.java.app;

import main.java.app.models.Component;
import main.java.app.enums.ComponentType;
import main.java.app.enums.ComponentUnit;
import main.java.app.models.UserShelf;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

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
        Collection<Component> components = shelf.getComponents().values();
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

    public void shelfAdd() throws IOException {
        Map<String, Component> components = shelf.getComponents();
        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Введи бренд:");
        String brand = ConsoleHelper.readString();
        ConsoleHelper.writeMessage("Введи название продукта:");
        String name = ConsoleHelper.readString();
        String key = brand + " " + name;
        ComponentType type = null;
        ComponentUnit unit = null;
        if (!components.containsKey(key)) {
            ConsoleHelper.writeMessage(String.format("Выбери тип (%s):", ComponentType.getValues()));
            type = ComponentType.valueOf(ConsoleHelper.readString());
            ConsoleHelper.writeMessage(String.format("Выбери единицы измерения (%s):", ComponentUnit.getValues()));
            unit = ComponentUnit.valueOf(ConsoleHelper.readString());
        }
        ConsoleHelper.writeMessage("Введи стоимость:");
        double cost = ConsoleHelper.readDouble();
        ConsoleHelper.writeMessage("Введи объём:");
        double volume = ConsoleHelper.readDouble();
        if (!components.containsKey(key)) {
            ConsoleHelper.writeMessage("Введи примечание:");
            String comment = ConsoleHelper.readString();
            shelf.addComponent(new Component(name, brand, type, unit, cost / volume, volume, comment));
            ConsoleHelper.writeMessage("");
            ConsoleHelper.writeMessage("Поставили компонент на полку!");
        } else {
            Component component = components.get(key);
            double oldCostPerUnit = component.getCostPerUnit();
            if (oldCostPerUnit != cost / volume) {
                ConsoleHelper.writeMessage(String.format("Обновить стоимость (%.2f ₽/%s - Y) или оставить прежней (%.2f ₽/%s - N)?",
                        cost / volume, component.getUnit().getUnit(), oldCostPerUnit, component.getUnit().getUnit()));
                String answer = ConsoleHelper.readString();
                if (answer.equals("Y")) {
                    component.setCostPerUnit(cost / volume);
                }
            }
            component.setCurrentVolume(component.getCurrentVolume() + volume);
            ConsoleHelper.writeMessage("");
            ConsoleHelper.writeMessage("Дополнили компонент на полке!");
        }
    }
}
