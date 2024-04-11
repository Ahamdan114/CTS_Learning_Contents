package cts.factory.pattern;

import cts.factory.pattern.example.*;
import cts.factory.pattern.implementation.*;
import cts.factory.pattern.implementation_abstract_factory.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Restaurant restaurant = new VegganBurgerRestaurant();
//        Burger burger = restaurant.orderBurger();
//
//        restaurant = new BeefBurgerRestaurant();
//        burger = restaurant.orderBurger();


//        Company company = new MSIManufacturer();
//        company.orderGPU();
//        company.orderMonitor();

        ArrayList<String> regizoriArr = new ArrayList<>();
        regizoriArr.add("Jean");
        regizoriArr.add("Smerean");

        ArrayList<String> actoriArr = new ArrayList<>();

        actoriArr.add("Actor_1");
        actoriArr.add("Actor_2");

        ArrayList<String> artists = new ArrayList<>();
        artists.add("Artist_1");
        artists.add("Artist_2");

        Spectacol spectacol = new Teatru("Spectacol de teatru pentru copii", "Caderea bastiliei", "21:00:03 16 jan", regizoriArr, actoriArr);
        IShow promotion = spectacol.orderPromotion();
        promotion.printDetails();

        Spectacol anotherSpectacol = new Concert("Concert pentru copii", "Caderea bastiliei", "21:00:03 26 jan", "Opera", actoriArr);
        IShow promotion2 = anotherSpectacol.orderPromotion();
        promotion2.printDetails();

        Spectacol lastSpectacol = new StandupComedy("StandupComedy pentru copii", "Caderea bastiliei", "21:00:03 06 jan", true, artists);
        IShow promotion3 = lastSpectacol.orderPromotion();
        promotion3.printDetails();
    }
}