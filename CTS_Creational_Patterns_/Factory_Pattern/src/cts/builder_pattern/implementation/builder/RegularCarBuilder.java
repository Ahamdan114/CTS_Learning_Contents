package cts.builder_pattern.implementation.builder;

import cts.builder_pattern.implementation.product.CarTemplate;
import cts.builder_pattern.implementation.product.RegularCar;

public class RegularCarBuilder implements CarBuilder{
    private CarTemplate carTemplate;


    // Aici am specifier package
    public RegularCarBuilder() {
        this.carTemplate = new RegularCar();
    }

    @Override
    public void buildChassis(String sasiu) {
        this.carTemplate.setChassis(sasiu);
    }

    @Override
    public void buildWheels(String roti) {
        this.carTemplate.setWheels(roti);
    }

    @Override
    public void buildInteriorDesign(String designInterior) {
        this.carTemplate.setInsideDesign(designInterior);
    }

    @Override
    public void buildEngine(String motor) {
        this.carTemplate.setEngine(motor);
    }

    public void buildAdditives(String additives) {
        RegularCar car = (RegularCar) carTemplate;
        car.setAdditives(additives);
    }

    @Override
    public CarTemplate getCar() {
        return this.carTemplate;
    }
}
