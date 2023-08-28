package app.command;

import app.UserBar;

public class ShelfOverviewCommand implements Command {
    @Override
    public void execute(UserBar userBar) throws Exception {
        userBar.shelfOverview();
    }
}
