package patterns.creational.abstractFactory.banking;

import patterns.creational.abstractFactory.Tester;

public class QualityAssuranceTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QATester tests banking code...");
    }
}