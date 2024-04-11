package cts.factory.pattern.implementation;

public class BeefBurgerRestaurant extends Restaurant {

    @Override
    protected Burger createBurger() {
        return new BeefBurger();
    }
}
