package app.shelf;

import app.components.Component;

import java.util.HashMap;
import java.util.Map;

public class UserShelf {
    private String userName;
    private long userId;
    private Map<String, Component> components;
    private double totalValue;

    public UserShelf(String userName, long userId) {
        this.userName = userName;
        this.userId = userId;
        this.components = new HashMap<>();
        this.totalValue = 0;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Map<String, Component> getComponents() {
        return components;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void addComponent (Component component) {
        String componentName = component.getBrand() + " " + component.getProduct();
        components.put(componentName, component);
    }

    public void deleteComponent (Component component) {
        components.remove(component);
    }

}
