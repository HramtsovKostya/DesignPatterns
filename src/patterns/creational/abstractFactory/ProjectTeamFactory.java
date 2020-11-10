package patterns.creational.abstractFactory;

import patterns.creational.factoryMethod.Developer;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}