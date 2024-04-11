package cts.factory.pattern.implementation;

public class VegganBurger implements Burger{
    VegganBurger() {}

    @Override
    public void description() {
        System.out.println("I'm a veggan burger");
    }

    @Override
    public void prepare() {

    }
}
