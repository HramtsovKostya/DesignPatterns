package patterns.structural.bridge;

import patterns.creational.factoryMethod.Developer;

public class BankSystem extends Program {
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank System Development in progress...");
        developer.writeCode();
    }
}