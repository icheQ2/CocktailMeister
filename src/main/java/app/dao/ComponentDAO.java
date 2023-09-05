package app.dao;

import app.models.Component;

import java.util.ArrayList;
import java.util.List;

public class ComponentDAO {
    private List<Component> components;

    {
        components = new ArrayList<>();
    }

    public List<Component> index() {
        return components;
    }

    public List<Component> showAll(long userId) {
        return components.stream().filter(component -> component.getUserId() == userId).toList();
    }

    public Component show(long id) {
        return components.stream().filter(component -> component.getId() == id).findAny().orElse(null);
    }

    public void save(Component component) {
        components.add(component);
    }

    public void update(long id, Component component) {
        Component componentToBeUpdated = show(id);

        componentToBeUpdated.setProduct(component.getProduct());
        componentToBeUpdated.setType(component.getType());
        componentToBeUpdated.setCostPerUnit(component.getCostPerUnit());
        componentToBeUpdated.setCurrentVolume(component.getCurrentVolume());
        componentToBeUpdated.setComment(component.getComment());
    }

    public void delete (long id) {
        components.removeIf(component -> component.getId() == id);
    }
}
