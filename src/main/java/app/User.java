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
        ComponentController.create(new Component(userId, "Leyenda del Milagro", "Tequila Silver", ComponentType.TEQUILA, ComponentUnit.ML, 2000d / 750d, 750d, "-")); // УДАЛИТЬ
        ComponentController.create(new Component(userId, "Giarola", "Creme de Cassis", ComponentType.LIQUOR, ComponentUnit.ML, 1000d / 700d, 700d, "-")); // УДАЛИТЬ
        ComponentController.create(new Component(userId, "Фреш", "Лайм", ComponentType.FRESH, ComponentUnit.ML, 50d / 30d, Double.POSITIVE_INFINITY, "-")); // УДАЛИТЬ
        ComponentController.create(new Component(userId, "Britvic", "Ginger Beer", ComponentType.LEMONADE, ComponentUnit.ML, 120d / 200d, 400d, "-")); // УДАЛИТЬ
        ComponentController.create(new Component(userId, "Лёд", "Кубики", ComponentType.ICE, ComponentUnit.PC, 20d, Double.POSITIVE_INFINITY, "-")); // УДАЛИТЬ
    }

    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}
