package patterns.creational.factoryMethod.phpDevelopment;

import patterns.creational.factoryMethod.*;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}