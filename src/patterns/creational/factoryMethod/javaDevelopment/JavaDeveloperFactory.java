package patterns.creational.factoryMethod.javaDevelopment;

import patterns.creational.factoryMethod.*;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}