package app;

import app.command.*;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {
    private static final Map<Operation, Command> allKnownCommandsMap = new HashMap<>();

    static {
        allKnownCommandsMap.put(Operation.SHELF_OVERVIEW, new ShelfOverviewCommand());
        allKnownCommandsMap.put(Operation.SHELF_ADD, new ShelfAddCommand());
        allKnownCommandsMap.put(Operation.SHELF_EDIT, new ShelfEditCommand());
        allKnownCommandsMap.put(Operation.COCKTAIL_SUGGEST, new CocktailSuggestCommand());
        allKnownCommandsMap.put(Operation.COCKTAIL_ADD, new CocktailAddCommand());
        allKnownCommandsMap.put(Operation.COCKTAIL_EDIT, new CocktailEditCommand());
        allKnownCommandsMap.put(Operation.APP_EXIT, new AppExitCommand());
    }

    public static void execute(Operation operation, UserBar userBar) throws Exception {
        allKnownCommandsMap.get(operation).execute(userBar);
    }
}
