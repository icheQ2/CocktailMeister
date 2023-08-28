package app.command;

import app.UserBar;

public class ShelfAddCommand implements Command {
    @Override
    public void execute(UserBar userBar) throws Exception {
        userBar.shelfAdd();
    }
}
