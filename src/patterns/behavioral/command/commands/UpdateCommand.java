package patterns.behavioral.command.commands;

import patterns.behavioral.command.Command;
import patterns.behavioral.command.Database;

public class UpdateCommand implements Command {
    private final Database database;

    public UpdateCommand(Database database) { this.database = database; }

    @Override
    public void execute() { database.update(); }
}