package cts.factory.pattern.implementation;

public class VegganBurgerRestaurant extends Restaurant {

    @Override
    protected Burger createBurger() {
        return new VegganBurger();
    }
}
