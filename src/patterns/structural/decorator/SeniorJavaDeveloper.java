package patterns.structural.decorator;

import patterns.creational.factoryMethod.Developer;

public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public void makeCodeReview() {
        System.out.println("Senior Java Developer makes code review...");
    }

    @Override
    public void writeCode() {
        super.writeCode();
        makeCodeReview();
    }
}