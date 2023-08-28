package app.command;

import app.ConsoleHelper;
import app.UserBar;

public class AppExitCommand implements Command {
    @Override
    public void execute(UserBar userBar) throws Exception {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
