package cts.builder_pattern.implementation;

import cts.builder_pattern.implementation.builder.CarBuilder;
import cts.builder_pattern.implementation.builder.ElectricalCarBuilder;
import cts.builder_pattern.implementation.builder.RegularCarBuilder;
import cts.builder_pattern.implementation.product.CarTemplate;

// Asta e directorul
public class CarEngineer {
    private CarBuilder builder;
    public CarEngineer(CarBuilder builder) {
        this.builder = builder;
    }

    public void buildCar() {
        builder.buildChassis("Sasiu de masina");
        builder.buildWheels("Roti cu capace de masina");
        builder.buildInteriorDesign("Interior masina");
        builder.buildEngine("Motor ");

        if(builder instanceof ElectricalCarBuilder) {
            ElectricalCarBuilder electricalType = (ElectricalCarBuilder) builder;
            electricalType.buildCharger("Incarcator rapid.");
        } else if (builder instanceof RegularCarBuilder) {
            RegularCarBuilder regularCarBuilder = (RegularCarBuilder) builder;
            regularCarBuilder.buildAdditives("Adblue Diesel.");
        }
    }

    public CarTemplate getCar() {
        return builder.getCar();
    }
}
