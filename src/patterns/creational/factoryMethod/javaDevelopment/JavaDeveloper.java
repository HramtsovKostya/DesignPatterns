package patterns.creational.factoryMethod.javaDevelopment;

import patterns.creational.factoryMethod.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}