package app.views;

import app.ConsoleHelper;
import app.User;
import app.controllers.ComponentController;
import app.enums.component_types.Type;
import app.models.Component;

import java.util.List;

public class ComponentEdit {
    public static void execute(User user) throws Exception {
        long userId = user.getUserId();
        List<Component> components = ComponentController.showAll(userId);
        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Изменение компонента");
        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Выбери компонент, который нужно изменить:");
        for (int i = 0; i < components.size(); i++) {
            ConsoleHelper.writeMessage(String.format("\t %d - %s", i, components.get(i).toString()));
        }
        Component component = components.get(ConsoleHelper.readInt());
        ConsoleHelper.writeMessage("Хочешь удалить компонент с полки (Y) или изменить его параметры (N)?");
        String answer = ConsoleHelper.readString();
        if (answer.equals("Y")) {
            ComponentController.delete(component.getId());
            ConsoleHelper.writeMessage("");
            ConsoleHelper.writeMessage("Удалили компонент с полки!");
            return;
        }
            ConsoleHelper.writeMessage("Поэтапно измени параметры компонента. Вводи '=', чтобы сохранить прежнее значение.");
        ConsoleHelper.writeMessage("Введи новое название продукта:");
        String product = ConsoleHelper.readString();
        if (!product.equals("=")) {
            component.setProduct(product);
        }
        ConsoleHelper.writeMessage(String.format("Выбери новый тип (%s):", Type.getValues()));
        String type = ConsoleHelper.readString();
        if (!type.equals("=")) {
            component.setType(Type.getSubType(Type.values()[Integer.parseInt(type)]));
        }
        ConsoleHelper.writeMessage(String.format("Введи новую стоимость за %s:", component.getType().getUnit()));
        String costPerUnit = ConsoleHelper.readString();
        if (!costPerUnit.equals("=")) {
            component.setCostPerUnit(Double.parseDouble(costPerUnit));
        }
        ConsoleHelper.writeMessage(String.format("Введи новый объём в %s:", component.getType().getUnit()));
        String volume = ConsoleHelper.readString();
        if (!volume.equals("=")) {
            component.setCurrentVolume(Double.parseDouble(volume));
        }
        ConsoleHelper.writeMessage("Введи новое примечание:");
        String comment = ConsoleHelper.readString();
        if (!comment.equals("=")) {
            component.setComment(comment);
        }
        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Изменили компонент на полке!");
        ComponentController.update(component.getId(), component);
    }
}
