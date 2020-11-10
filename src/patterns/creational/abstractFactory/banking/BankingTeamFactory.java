package patterns.creational.abstractFactory.banking;

import patterns.creational.abstractFactory.*;
import patterns.creational.factoryMethod.Developer;
import patterns.creational.factoryMethod.javaDevelopment.JavaDeveloper;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QualityAssuranceTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingProjectManager();
    }
}