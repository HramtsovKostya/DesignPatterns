package patterns.creational.factoryMethod.cppDevelopment;

import patterns.creational.factoryMethod.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes C++ code...");
    }
}