package app.models;

import app.enums.PreparationMethod;

import java.util.List;
import java.util.Map;

public class Receipt {
    private long id;
    private String name;
    private Map<Component, Double> ingredients;
    private double price;
    private double volume;
    private List<PreparationMethod> preparationMethods;
    private String comment;
    private static long counter;

    public Receipt(String name, Map<Component, Double> ingredients, double price, double volume, List<PreparationMethod> preparationMethods, String comment) {
        this.id = counter++;
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.volume = volume;
        this.preparationMethods = preparationMethods;
        this.comment = comment;
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

    public Map<Component, Double> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Map<Component, Double> ingredients) {
        this.ingredients = ingredients;
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

    public String toShortString() {
        String ingredientsTypes = "";
        for (Component component : ingredients.keySet()) {
            ingredientsTypes += String.format(", %s", component.getType().getType());
        }
        ingredientsTypes = ingredientsTypes.substring(2);
        String methodsNames = "";
        for (PreparationMethod preparationMethod : preparationMethods) {
            methodsNames += String.format("+%s", preparationMethod.getMethod());
        }
        methodsNames = methodsNames.substring(1);
        return String.format("%s (%s) | %.0f мл | %.2f ₽ | %s | %s",
                name, ingredientsTypes, volume, price, methodsNames, comment);
    }

    @Override
    public String toString() {
        String result = String.format("Коктейль \"%s\"\n", name);
        result += String.format("%.0f мл за %.2f ₽\n", volume, price);
        for (Component component : ingredients.keySet()) {
            result += String.format("%s %s %s - %.0f %s\n", component.getType().getType(), component.getBrand(),
                    component.getProduct(), ingredients.get(component), component.getUnit().getUnit());
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
