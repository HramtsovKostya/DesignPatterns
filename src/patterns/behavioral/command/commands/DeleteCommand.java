package patterns.behavioral.command.commands;

import patterns.behavioral.command.Command;
import patterns.behavioral.command.Database;

public class DeleteCommand implements Command {
    private final Database database;

    public DeleteCommand(Database database) { this.database = database; }

    @Override
    public void execute() { database.delete(); }
}