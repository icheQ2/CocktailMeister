package app;

import app.controllers.ComponentController;
import app.controllers.ReceiptController;
import app.controllers.ShelfController;
import app.enums.PreparationMethod;
import app.models.Component;
import app.enums.ComponentType;
import app.models.Receipt;
import app.models.Shelf;

import java.util.ArrayList; // УДАЛИТЬ
import java.util.Arrays; // УДАЛИТЬ

public class User {
    private String userName;
    private final long userId;
    private Shelf shelf;

    public User(String userName, long userId) {
        this.userName = userName;
        this.userId = userId;
        this.shelf = new Shelf(userId, userName);
        ShelfController.create(shelf);
        ComponentController.create(new Component(userId, "Leyenda del Milagro", "Tequila Silver", ComponentType.TEQUILA, 2000d / 750d, 750d, "-")); // УДАЛИТЬ
        ComponentController.create(new Component(userId, "Giarola", "Creme de Cassis", ComponentType.LIQUOR, 1000d / 700d, 700d, "-")); // УДАЛИТЬ
        ComponentController.create(new Component(userId, "Фреш", "Лайм", ComponentType.FRESH, 50d / 30d, Double.POSITIVE_INFINITY, "-")); // УДАЛИТЬ
        ComponentController.create(new Component(userId, "Britvic", "Ginger Beer", ComponentType.LEMONADE, 120d / 200d, 400d, "-")); // УДАЛИТЬ
        ComponentController.create(new Component(userId, "Лёд", "Кубики", ComponentType.ICE, 20d, Double.POSITIVE_INFINITY, "-")); // УДАЛИТЬ
        ReceiptController.create(new Receipt("Greyhound", new ArrayList<>(Arrays.asList(ComponentType.GIN, ComponentType.JUICE, ComponentType.ICE)), new ArrayList<>(Arrays.asList(45d, 90d, 1d)), -1d, 135d, new ArrayList<>(Arrays.asList(PreparationMethod.BUILD)), "Просто смешать")); // УДАЛИТЬ
        ReceiptController.create(new Receipt("El Diablo", new ArrayList<>(Arrays.asList(ComponentType.TEQUILA, ComponentType.LIQUOR, ComponentType.FRESH, ComponentType.LEMONADE, ComponentType.ICE)), new ArrayList<>(Arrays.asList(45d, 15d, 15d, 60d, 1d)), -1d, 135d, new ArrayList<>(Arrays.asList(PreparationMethod.SHAKE, PreparationMethod.BUILD)), "Шейкануть, смешать с пивом")); // УДАЛИТЬ
    }

    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}
