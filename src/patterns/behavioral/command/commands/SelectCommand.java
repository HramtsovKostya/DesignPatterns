package patterns.behavioral.command.commands;

import patterns.behavioral.command.Command;
import patterns.behavioral.command.Database;

public class SelectCommand implements Command {
    private final Database database;

    public SelectCommand(Database database) { this.database = database; }

    @Override
    public void execute() { database.select(); }
}