package patterns.structural.composite;

import patterns.creational.factoryMethod.Developer;
import java.util.*;

public class TeamOfDevelopers {
    private final List<Developer> developers;

    public TeamOfDevelopers() {
        developers = new ArrayList<>();
    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    public void createProject() {
        System.out.println("Team creates project...");

        for (Developer developer : developers)
            developer.writeCode();
    }
}