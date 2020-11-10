package patterns.creational.factoryMethod.phpDevelopment;

import patterns.creational.factoryMethod.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes Php code...");
    }
}