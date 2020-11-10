package patterns.creational.factoryMethod.cppDevelopment;

import patterns.creational.factoryMethod.*;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}