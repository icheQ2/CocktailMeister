package app.controllers;

import app.config.SpringConfig;
import app.dao.ComponentDAO;
import app.models.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ComponentController {

    private static final ComponentDAO componentDAO = new ComponentDAO();

    public static List<Component> index() throws Exception {
        return componentDAO.index();
    }

    public static List<Component> showAll(long userId) throws Exception {
        return componentDAO.showAll(userId);
    }

    public static Component show(long id) throws Exception {
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
