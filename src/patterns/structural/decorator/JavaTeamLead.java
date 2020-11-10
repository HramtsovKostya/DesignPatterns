package patterns.structural.decorator;

import patterns.creational.factoryMethod.Developer;

public class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public void sendWeekReport() {
        System.out.println("Java TeamLead sends week report...");
    }

    @Override
    public void writeCode() {
        super.writeCode();
        sendWeekReport();
    }
}