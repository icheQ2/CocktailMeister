package app.views;

import app.ConsoleHelper;
import app.User;
import app.controllers.ComponentController;
import app.enums.component_types.Type;
import app.enums.component_types.ComponentType;
import app.models.Component;

import java.util.List;

public class ComponentAdd {
    public static void execute(User user) throws Exception {
        long userId = user.getUserId();
        List<Component> components = ComponentController.showAll(userId);
        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Добавление компонента");
        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Введи название продукта:");
        String product = ConsoleHelper.readString();
        ConsoleHelper.writeMessage(String.format("Выбери тип (%s):", Type.getValues()));
        int typeOrdinal = ConsoleHelper.readInt();
        ComponentType type = Type.values()[typeOrdinal];
        ComponentType subType = Type.getSubType(Type.values()[typeOrdinal], -1);
        Component usedComponent = null;
        for (Component component : components) {
            if (component.getProduct().equals(product) && component.getSubType().equals(subType)) {
                usedComponent = component;
            }
        }
        ConsoleHelper.writeMessage("Введи стоимость:");
        double cost = ConsoleHelper.readDouble();
        ConsoleHelper.writeMessage("Введи объём:");
        double volume = ConsoleHelper.readDouble();
        if (usedComponent == null) {
            ConsoleHelper.writeMessage("Введи примечание:");
            String comment = ConsoleHelper.readString();
            ComponentController.create(new Component(userId, product, type, subType, cost / volume, volume, comment));
            ConsoleHelper.writeMessage("");
            ConsoleHelper.writeMessage("Поставили компонент на полку!");
        } else {
            double oldCostPerUnit = usedComponent.getCostPerUnit();
            if (oldCostPerUnit != cost / volume) {
                ConsoleHelper.writeMessage(String.format("Обновить стоимость (%.2f ₽/%s - Y) или оставить прежней (%.2f ₽/%s - N)?",
                        cost / volume, usedComponent.getSubType().getUnit(), oldCostPerUnit, usedComponent.getSubType().getUnit()));
                String answer = ConsoleHelper.readString();
                if (answer.equals("Y")) {
                    usedComponent.setCostPerUnit(cost / volume);
                }
            }
            usedComponent.setCurrentVolume(usedComponent.getCurrentVolume() + volume);
            usedComponent.updateTotalCost();
            ConsoleHelper.writeMessage("");
            ConsoleHelper.writeMessage("Дополнили компонент на полке!");
            ComponentController.update(usedComponent.getId(), usedComponent);
        }
    }
}
