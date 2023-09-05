package app.views;

import app.ConsoleHelper;
import app.controllers.ReceiptController;
import app.enums.component_types.ComponentType;
import app.enums.component_types.Type;
import app.enums.PreparationMethod;
import app.models.Receipt;

import java.util.ArrayList;
import java.util.List;

public class ReceiptAdd {
    public static void execute() throws Exception {
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
            ConsoleHelper.writeMessage(String.format("Выбери тип компонента (%s):", Type.getValues()));
            ingredientInput = ConsoleHelper.readString();
            if (!ingredientInput.equals("=")) {
                ComponentType type = Type.getSubType(Type.values()[Integer.parseInt(ingredientInput)]);
                ConsoleHelper.writeMessage(String.format("Введи объём (%s):", type.getUnit()));
                volumeInput = ConsoleHelper.readDouble();
                ingredientsList.add(type);
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

        ReceiptController.create(new Receipt(name, ingredientsList, volumesList, preparationMethods, comment));
    }
}
