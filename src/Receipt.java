import java.util.Map;

public class Receipt {
    private String name;
    private Map<Component, Double> ingredients;
    private double price;
    private double volume;

    public Receipt(String name, Map<Component, Double> ingredients, double price, double volume) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.volume = volume;
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

    public double getVolume() {
        return volume;
    }
}
