package patterns.structural.bridge;

import patterns.creational.factoryMethod.Developer;

public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}