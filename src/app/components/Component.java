package app.components;

public class Component {
    private String brand;
    private String product;
    private ComponentType type;
    private ComponentUnit unit;
    private double costPerUnit;
    private double currentVolume;
    private String comment;

    public Component(String brand, String product, ComponentType type, ComponentUnit unit, double costPerUnit, double currentVolume, String comment) {
        this.brand = brand;
        this.product = product;
        this.type = type;
        this.unit = unit;
        this.costPerUnit = costPerUnit;
        this.currentVolume = currentVolume;
        this.comment = comment;
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

    public ComponentUnit getUnit() {
        return unit;
    }

    public void setUnit(ComponentUnit unit) {
        this.unit = unit;
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

    @Override
    public String toString() {
        String typeCap = type.getType().substring(0, 1).toUpperCase() + type.getType().substring(1);
        String brandAndName = brand.equals(product) ? brand : brand + product;
        return String.format("%s %s | %.0f %s | %.2f ₽/%s | %s",
                typeCap, brandAndName, currentVolume, unit.getUnit(), costPerUnit, unit.getUnit(), comment);
    }
}