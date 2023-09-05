package app.controllers;

import app.dao.ComponentDAO;
import app.models.Component;

import java.util.List;

public class ComponentController {

    private static final ComponentDAO componentDAO = new ComponentDAO();

    public static List<Component> index() {
        return componentDAO.index();
    }

    public static List<Component> showAll(long userId) {
        return componentDAO.showAll(userId);
    }

    public static Component show(long id) {
        return componentDAO.show(id);
    }

    public static void create(Component component) {
        componentDAO.save(component);
    }

    public static void update(long id, Component component) {
        componentDAO.update(id, component);
    }

    public static void delete(long id) {
        componentDAO.delete(id);
    }
}
