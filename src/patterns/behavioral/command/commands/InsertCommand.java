package patterns.behavioral.command.commands;

import patterns.behavioral.command.Command;
import patterns.behavioral.command.Database;

public class InsertCommand implements Command {
    private final Database database;

    public InsertCommand(Database database) { this.database = database; }

    @Override
    public void execute() { database.insert(); }
}
