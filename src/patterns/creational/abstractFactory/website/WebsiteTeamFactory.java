package patterns.creational.abstractFactory.website;

import patterns.creational.abstractFactory.*;
import patterns.creational.factoryMethod.Developer;
import patterns.creational.factoryMethod.phpDevelopment.PhpDeveloper;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsiteProjectManager();
    }
}