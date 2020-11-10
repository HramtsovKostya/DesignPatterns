package patterns.structural.bridge;

import patterns.creational.factoryMethod.Developer;

public class StockExchange extends Program {
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange Development in progress...");
        developer.writeCode();
    }
}