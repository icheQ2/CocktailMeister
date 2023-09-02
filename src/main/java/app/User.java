package app;

import app.controllers.ComponentController;
import app.controllers.ShelfController;
import app.models.Component;
import app.enums.ComponentType;
import app.enums.ComponentUnit;
import app.models.Shelf;

public class User {
    private String userName;
    private final long userId;
    private Shelf shelf;

    public User(String userName, long userId) {
        this.userName = userName;
        this.userId = userId;
        this.shelf = new Shelf(userId, userName);
        ShelfController.create(shelf);
        ComponentController.create(new Component(userId, "Campari", "Campari", ComponentType.LIQUOR, ComponentUnit.ML, 1000d / 700d, 700, "qq")); // УДАЛИТЬ
        ComponentController.create(new Component(userId, "Barrister", "Sloe", ComponentType.GIN, ComponentUnit.ML, 2000d / 1000d, 1000, "bb")); // УДАЛИТЬ
    }

    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}
