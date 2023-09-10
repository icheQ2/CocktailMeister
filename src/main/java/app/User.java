package app;

import app.controllers.ReceiptController;
import app.controllers.ShelfController;
import app.enums.PreparationMethod;
import app.enums.component_types.*;
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
        Shelf userShelf = ShelfController.show(userId);
        if (userShelf == null) {
            this.shelf = new Shelf(userId, userName);
            ShelfController.create(shelf);
            ConsoleHelper.writeMessage(String.format("Пользователь %s зарегистрирован!", userName));
        } else {
            this.shelf = userShelf;
            ConsoleHelper.writeMessage(String.format("Добро пожаловать обратно, %s!", userName));
        }
        ReceiptController.create(new Receipt("Greyhound", new ArrayList<>(Arrays.asList(GinType.GIN_LONDONDRY, FreshType.FRESH_GRAPEFRUIT, IceType.ICE_CUBES)), new ArrayList<>(Arrays.asList(45d, 90d, 1d)), new ArrayList<>(Arrays.asList(PreparationMethod.BUILD)), "Просто смешать")); // УДАЛИТЬ
        ReceiptController.create(new Receipt("El Diablo", new ArrayList<>(Arrays.asList(TequilaType.TEQUILA_SILVER, LiquorType.LIQUOR_CASSIS, FreshType.FRESH_LIME, SodaType.SODA_GINGERBEER, IceType.ICE_CUBES)), new ArrayList<>(Arrays.asList(45d, 15d, 15d, 60d, 1d)), new ArrayList<>(Arrays.asList(PreparationMethod.SHAKE, PreparationMethod.BUILD)), "Шейкануть, смешать с пивом")); // УДАЛИТЬ
    }

    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}
