package cts.builder_pattern.implementation.product;

import cts.builder_pattern.implementation.product.CarTemplate;

public class ElectricalCar implements CarTemplate {

    private String chassis;
    private String wheels;
    private String engine;
    private String insideDesign;
    private String charger;


    @Override
    public void reset() {
        this.chassis = null;
        this.wheels = null;
        this.engine = null;
        this.insideDesign = null;
        this.charger = null;
    }

    @Override
    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    @Override
    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setInsideDesign(String insideDesign) {
        this.insideDesign = insideDesign;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    @Override
    public String showDetails() {
        return this.toString();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder("ElectricalCar{");
        builder.append("chassis='").append(chassis).append('\'');
        builder.append(", wheels='").append(wheels).append('\'');
        builder.append(", engine='").append(engine).append('\'');
        builder.append(", insideDesign='").append(insideDesign).append('\'');
        builder.append(", additives='").append(charger).append('\'');
        builder.append('}');
        return builder.toString();
    }
}
