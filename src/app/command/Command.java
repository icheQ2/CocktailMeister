package app.command;

import app.UserBar;

public interface Command {
    void execute(UserBar userBar) throws Exception;
}
