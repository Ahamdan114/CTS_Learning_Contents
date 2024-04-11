package cts.builder_pattern.implementation;

import cts.builder_pattern.implementation.CarEngineer;
import cts.builder_pattern.implementation.builder.CarBuilder;
import cts.builder_pattern.implementation.builder.ElectricalCarBuilder;
import cts.builder_pattern.implementation.builder.RegularCarBuilder;
import cts.builder_pattern.implementation.product.CarTemplate;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new ElectricalCarBuilder();
        CarEngineer director = new CarEngineer(builder);

        director.buildCar();
        CarTemplate masina = director.getCar();
        System.out.println(masina.showDetails());

        builder = new RegularCarBuilder();
        director = new CarEngineer(builder);

        director.buildCar();
        masina = director.getCar();
        System.out.println(masina.showDetails());
    }
}