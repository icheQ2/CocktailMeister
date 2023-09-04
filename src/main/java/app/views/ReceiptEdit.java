package app.views;

import app.ConsoleHelper;
import app.controllers.ComponentController;
import app.controllers.ReceiptController;
import app.enums.component_types.MajorType;
import app.enums.PreparationMethod;
import app.models.Receipt;

import java.util.ArrayList;
import java.util.List;

public class ReceiptEdit {
    public static void execute() throws Exception {
        List<Receipt> receipts = ReceiptController.showAll();
        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Изменение рецепта коктейля");
        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Выбери рецепт, который нужно изменить:");
        for (int i = 0; i < receipts.size(); i++) {
            ConsoleHelper.writeMessage(String.format("\t %d - %s", i, receipts.get(i).getName()));
        }
        Receipt receipt = receipts.get(ConsoleHelper.readInt());
        ConsoleHelper.writeMessage("Хочешь удалить рецепт из базы (Y) или изменить его (N)?");
        String answer1 = ConsoleHelper.readString();
        if (answer1.equals("Y")) {
            ComponentController.delete(receipt.getId());
            ConsoleHelper.writeMessage("");
            ConsoleHelper.writeMessage("Удалили рецепт из базы!");
            return;
        }
        ConsoleHelper.writeMessage("Поэтапно измени параметры компонента. Вводи '=', чтобы сохранить прежнее значение.");
        ConsoleHelper.writeMessage("Введи новое название:");
        String brand = ConsoleHelper.readString();
        if (!brand.equals("=")) {
            receipt.setName(brand);
        }
        ConsoleHelper.writeMessage("Хочешь заново собрать состав коктейля (Y) или оставить прежний (N)?");
        String answer2 = ConsoleHelper.readString();
        if (answer2.equals("Y")) {
            ConsoleHelper.writeMessage("Выбери компоненты, а затем введи их объём:");
            ConsoleHelper.writeMessage("[введи \"=\" для перехода дальше]");
            String ingredientInput = "";
            double volumeInput;
            List<MajorType> ingredientsList = new ArrayList<>();
            List<Double> volumesList = new ArrayList<>();
            double totalVolume = 0;
            while (!ingredientInput.equals("=")) {
                ConsoleHelper.writeMessage("Выбери компонент:");
                ConsoleHelper.writeMessage(MajorType.getValues());
                ingredientInput = ConsoleHelper.readString();
                if (!ingredientInput.equals("=")) {
                    ConsoleHelper.writeMessage("Введи объём:");
                    volumeInput = ConsoleHelper.readDouble();
                    MajorType majorType = MajorType.values()[Integer.parseInt(ingredientInput)];
                    ingredientsList.add(majorType);
                    volumesList.add(volumeInput);
                    totalVolume += volumeInput;
                }
            }
            receipt.setIngredientsList(ingredientsList);
            receipt.setVolumesList(volumesList);
            receipt.setVolume(totalVolume);
        }
        ConsoleHelper.writeMessage("Хочешь заново выбрать методы приготовления (Y) или оставить прежние (N)?");
        String answer3 = ConsoleHelper.readString();
        if (answer3.equals("Y")) {
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
            receipt.setPreparationMethods(preparationMethods);
        }
        ConsoleHelper.writeMessage("Введи новое примечание:");
        String comment = ConsoleHelper.readString();
        if (!comment.equals("=")) {
            receipt.setComment(comment);
        }
        ConsoleHelper.writeMessage("");
        ConsoleHelper.writeMessage("Изменили рецепт в базе!");
        ReceiptController.update(receipt.getId(), receipt);
    }
}
