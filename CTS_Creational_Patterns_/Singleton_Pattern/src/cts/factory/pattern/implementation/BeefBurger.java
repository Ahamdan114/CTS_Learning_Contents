package cts.factory.pattern.implementation;

public class BeefBurger implements Burger {
    BeefBurger() {}

    @Override
    public void description() {
        System.out.println("I'm a beef burger");
    }

    @Override
    public void prepare() {

    }
}
