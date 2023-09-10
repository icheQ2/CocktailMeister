package app.models;

import app.enums.component_types.ComponentType;

public class Component {
    private long id;
    private long userId;
    private String product;
    private ComponentType mainType;
    private ComponentType subType;
    private double costPerUnit;
    private double currentVolume;
    private double totalCost;
    private String comment;

    public Component(long userId, String product, ComponentType mainType, ComponentType subType, double costPerUnit, double currentVolume, String comment) {
        this.userId = userId;
        this.product = product;
        this.mainType = mainType;
        this.subType = subType;
        this.costPerUnit = costPerUnit;
        this.currentVolume = currentVolume;
        this.totalCost = costPerUnit * currentVolume;
        this.comment = comment;
    }

    public Component() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public ComponentType getMainType() {
        return mainType;
    }

    public void setMainType(ComponentType mainType) {
        this.mainType = mainType;
    }

    public ComponentType getSubType() {
        return subType;
    }

    public void setSubType(ComponentType subType) {
        this.subType = subType;
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

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void updateTotalCost() {
        totalCost = costPerUnit * currentVolume;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        String typeCap = subType.getType().substring(0, 1).toUpperCase() + subType.getType().substring(1);
        return String.format("%s %s | %.0f %s | %.2f ₽/%s | %s",
                typeCap, product, currentVolume, subType.getUnit(), costPerUnit, subType.getUnit(), comment);
    }
}