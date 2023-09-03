package app.models;

import app.enums.ComponentType;
import app.enums.PreparationMethod;

import java.util.List;
import java.util.Map;

public class Receipt {
    private long id;
    private String name;
    private List<ComponentType> ingredientsList;
    private List<Double> volumesList;
    private double price;
    private double volume;
    private List<PreparationMethod> preparationMethods;
    private String comment;
    private long timesDone;
    private long likes;
    private long dislikes;
    private static long counter;

    public Receipt(String name, List<ComponentType> ingredientsList, List<Double> volumesList, double price, double volume, List<PreparationMethod> preparationMethods, String comment) {
        this.id = counter++;
        this.name = name;
        this.ingredientsList = ingredientsList;
        this.volumesList = volumesList;
        this.price = price;
        this.volume = volume;
        this.preparationMethods = preparationMethods;
        this.comment = comment;
        this.timesDone = 0;
        this.likes = 0;
        this.dislikes = 0;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ComponentType> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(List<ComponentType> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }

    public List<Double> getVolumesList() {
        return volumesList;
    }

    public void setVolumesList(List<Double> volumesList) {
        this.volumesList = volumesList;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public List<PreparationMethod> getPreparationMethods() {
        return preparationMethods;
    }

    public void setPreparationMethods(List<PreparationMethod> preparationMethods) {
        this.preparationMethods = preparationMethods;
    }

    public void cocktailDone() {
        timesDone++;
    }

    public void like() {
        likes++;
    }

    public void dislike() {
        dislikes++;
    }

    public String toShortString() {
        String ingredientsTypes = "";
        for (ComponentType componentType : ingredientsList) {
            ingredientsTypes += String.format(", %s", componentType.getType());
        }
        ingredientsTypes = ingredientsTypes.substring(2);
        String methodsNames = "";
        for (PreparationMethod preparationMethod : preparationMethods) {
            methodsNames += String.format("+%s", preparationMethod.getMethod());
        }
        methodsNames = methodsNames.substring(1);
        String result;
        if (price == -1 && timesDone == 0) {
            result = String.format("%s (%s) | %.0f мл | NEW! | %s | %s",
                    name, ingredientsTypes, volume, methodsNames, comment);
        } else {
            result = String.format("%s (%s) | %.0f мл | %.2f ₽ | %s | %d раз (%d\uD83D\uDC4D %d\uD83D\uDC4E)",
                    name, ingredientsTypes, volume, price, methodsNames, timesDone, likes, dislikes);
        }
        return result;
    }

    @Override
    public String toString() {
        String result = String.format("Коктейль \"%s\" (%.0f мл)\n", name, volume);
        if (price == -1 && timesDone == 0) {
            result += String.format("Данный коктейль ни разу не готовили!\n", price);
        } else {
            result += String.format("Стоимость: %.2f ₽, сделан %d раз (%d\uD83D\uDC4D %d\uD83D\uDC4E)\n", price, timesDone, likes, dislikes);
        }
        for (int i = 0; i < ingredientsList.size(); i++) {
            result += String.format("%s - %.0f %s\n", ingredientsList.get(i).getType(), volumesList.get(i), ingredientsList.get(i).getUnit());
        }
        String methodsNames = "";
        for (PreparationMethod preparationMethod : preparationMethods) {
            methodsNames += String.format("+%s", preparationMethod.getMethod());
        }
        result += String.format("Способ приготовления: %s\n", methodsNames.substring(1));
        result += comment;
        return result;
    }
}
