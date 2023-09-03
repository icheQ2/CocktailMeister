package app.views;

import app.ConsoleHelper;
import app.User;
import app.controllers.ComponentController;
import app.controllers.ReceiptController;
import app.enums.ComponentType;
import app.enums.PreparationMethod;
import app.models.Component;
import app.models.Receipt;

import java.util.ArrayList;
import java.util.List;

public class ReceiptAdd {
    public static void execute(User user) throws Exception {
        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Создание коктейля");
        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Введи название коктейля:");
        String name = ConsoleHelper.readString();
        ConsoleHelper.writeMessage("Выбери компоненты, а затем введи их объём:");
        ConsoleHelper.writeMessage("[введи \"=\" для перехода дальше]");
        String ingredientInput = "";
        double volumeInput;
        List<ComponentType> ingredientsList = new ArrayList<>();
        List<Double> volumesList = new ArrayList<>();
        double totalVolume = 0;
        while (!ingredientInput.equals("=")) {
            ConsoleHelper.writeMessage("Выбери компонент:");
            ConsoleHelper.writeMessage(ComponentType.getValues());
            ingredientInput = ConsoleHelper.readString();
            if (!ingredientInput.equals("=")) {
                ConsoleHelper.writeMessage("Введи объём:");
                volumeInput = ConsoleHelper.readDouble();
                ComponentType componentType = ComponentType.values()[Integer.parseInt(ingredientInput)];
                ingredientsList.add(componentType);
                volumesList.add(volumeInput);
                totalVolume += volumeInput;
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

        ReceiptController.create(new Receipt(name, ingredientsList, volumesList, -1, totalVolume, preparationMethods, comment));
    }
}
