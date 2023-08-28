package app.components;

public class Component {
    private String name;
    private String brand;
    private ComponentType type;
    private double costPerUnit;
    private double currentVolume;
    private String comment;

    public Component(String name, String brand, ComponentType type, double costPerUnit, double currentVolume, String comment) {
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.costPerUnit = costPerUnit;
        this.currentVolume = currentVolume;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCostPerUnit() {
        return costPerUnit;
    }

    public void setCostPerUnit(double costPerUnit) {
        this.costPerUnit = costPerUnit;
    }

    public double getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(double currentVolume) {
        this.currentVolume = currentVolume;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
