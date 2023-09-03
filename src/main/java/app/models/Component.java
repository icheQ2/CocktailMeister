package app.models;

import app.enums.ComponentType;

public class Component {
    private final long userId;
    private long id;
    private String brand;
    private String product;
    private ComponentType type;
    private double costPerUnit;
    private double currentVolume;
    private double totalCost;
    private String comment;
    private static long counter;

    public Component(long userId, String brand, String product, ComponentType type, double costPerUnit, double currentVolume, String comment) {
        this.userId = userId;
        this.id = counter++;
        this.brand = brand;
        this.product = product;
        this.type = type;
        this.costPerUnit = costPerUnit;
        this.currentVolume = currentVolume;
        this.totalCost = costPerUnit * currentVolume;
        this.comment = comment;
    }

    public long getUserId() {
        return userId;
    }

    public long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public ComponentType getType() {
        return type;
    }

    public void setType(ComponentType type) {
        this.type = type;
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

    public double getTotalCost() {
        return totalCost;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        String typeCap = type.getType().substring(0, 1).toUpperCase() + type.getType().substring(1);
        String brandAndName = brand.equals(product) ? brand : brand + " " + product;
        return String.format("%s %s | %.0f %s | %.2f ₽/%s | %s",
                typeCap, brandAndName, currentVolume, type.getUnit(), costPerUnit, type.getUnit(), comment);
    }
}