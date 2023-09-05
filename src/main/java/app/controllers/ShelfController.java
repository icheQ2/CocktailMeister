package app.controllers;

import app.dao.ShelfDAO;
import app.models.Shelf;

import java.util.List;

public class ShelfController {

    private static final ShelfDAO shelfDAO = new ShelfDAO();

    public static List<Shelf> index() {
        return shelfDAO.index();
    }

    public static Shelf show(long userId) {
        return shelfDAO.show(userId);
    }

    public static void create(Shelf shelf) {
        shelfDAO.save(shelf);
    }

    public static void update(long userId, Shelf shelf) {
        shelfDAO.update(userId, shelf);
    }

    public void delete(long userId) {
        shelfDAO.delete(userId);
    }
}
