package patterns.structural.flyweight;

import patterns.creational.factoryMethod.Developer;
import patterns.creational.factoryMethod.cppDevelopment.CppDeveloper;
import patterns.creational.factoryMethod.javaDevelopment.JavaDeveloper;

import java.util.*;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specialty) {
        Developer developer = developers.get(specialty);

        if (developer == null) {
            switch (specialty) {
                case "java" -> {
                    System.out.println("Hiring Java developer...");
                    developer = new JavaDeveloper();
                }
                case "c++" -> {
                    System.out.println("Hiring C++ developer...");
                    developer = new CppDeveloper();
                }
            } developers.put(specialty, developer);
        } return developer;
    }
}