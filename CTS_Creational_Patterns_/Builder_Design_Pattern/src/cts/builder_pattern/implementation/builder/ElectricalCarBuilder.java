package cts.builder_pattern.implementation.builder;

import cts.builder_pattern.implementation.product.CarTemplate;
import cts.builder_pattern.implementation.product.ElectricalCar;
import cts.builder_pattern.implementation.product.RegularCar;

public class ElectricalCarBuilder implements CarBuilder{
    private CarTemplate carTemplate;


    // Aici am specifier package
    public ElectricalCarBuilder() {
        this.carTemplate = new ElectricalCar();
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

    public void buildCharger(String charger) {
        ElectricalCar car = (ElectricalCar) carTemplate;
        car.setCharger(charger);
    }

    @Override
    public CarTemplate getCar() {
        return this.carTemplate;
    }
}
