package app.views;

import app.ConsoleHelper;
import app.User;
import app.controllers.ComponentController;
import app.controllers.ReceiptController;
import app.enums.PreparationMethod;
import app.models.Component;
import app.models.Receipt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReceiptAdd {
    public static void execute(User user) throws Exception {
        long userId = user.getUserId();
        List<Component> components = ComponentController.showAll(userId);
        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Создание коктейля");
        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Введи название коктейля:");
        String name = ConsoleHelper.readString();
        ConsoleHelper.writeMessage("Выбери компоненты, а затем введи их объём:");
        ConsoleHelper.writeMessage("[введи \"=\" для перехода дальше]");
        String ingredientInput = "";
        double volumeInput = 0d;
        Map<Component, Double> ingredients = new HashMap<>();
        double price = 0;
        double volume = 0;
        while (!ingredientInput.equals("=")) {
            ConsoleHelper.writeMessage("Выбери компонент:");
            for (int i = 0; i < components.size(); i++) {
                ConsoleHelper.writeMessage(String.format("\t %d - %s", i, components.get(i).toString()));
            }
            ingredientInput = ConsoleHelper.readString();
            if (!ingredientInput.equals("=")) {
                ConsoleHelper.writeMessage("Введи объём:");
                volumeInput = ConsoleHelper.readDouble();
                Component component = components.get(Integer.parseInt(ingredientInput));
                ingredients.put(component, volumeInput);
                price += component.getCostPerUnit() * volumeInput;
                volume += volumeInput;
            }
        }
        ConsoleHelper.writeMessage(String.format("Выбери методы приготовления (%s):", PreparationMethod.getValues()));
        ConsoleHelper.writeMessage("[введи \"=\" для перехода дальше]");
        String methodInput = "";
        List<PreparationMethod> preparationMethods = new ArrayList<>();
        while (!methodInput.equals("=")) {
            methodInput = ConsoleHelper.readString();
            if (!methodInput.equals("=")) {
                preparationMethods.add(PreparationMethod.values()[Integer.parseInt(methodInput)]);
            }
        }
        ConsoleHelper.writeMessage("Введи примечание:");
        String comment = ConsoleHelper.readString();

        ReceiptController.create(new Receipt(name, ingredients, price, volume, preparationMethods, comment));
    }
}
