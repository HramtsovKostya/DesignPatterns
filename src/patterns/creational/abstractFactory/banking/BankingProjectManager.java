package patterns.creational.abstractFactory.banking;

import patterns.creational.abstractFactory.ProjectManager;

public class BankingProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}