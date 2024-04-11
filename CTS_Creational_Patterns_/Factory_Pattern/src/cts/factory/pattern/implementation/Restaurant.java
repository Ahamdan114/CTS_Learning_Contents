package cts.factory.pattern.implementation;

public abstract class Restaurant {
    public Burger orderBurger() {
        Burger burger = this.createBurger();
        burger.description();
        return burger;
    }

    abstract Burger createBurger();
}
