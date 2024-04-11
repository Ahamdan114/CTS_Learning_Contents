package cts.builder_pattern.implementation.product;

import cts.builder_pattern.implementation.product.CarTemplate;

public class RegularCar implements CarTemplate {

    private String chassis;
    private String wheels;
    private String engine;
    private String insideDesign;
    private String additives;


    @Override
    public void reset() {
        String chassis = null;
        String wheels = null;
        String engine = null;
        String insideDesign = null;
        String additives = null;
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

    public void setAdditives(String additives) {
        this.additives = additives;
    }


    @Override
    public String showDetails() {
        return this.toString();
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder("RegularCar{");
        stringBuilder.append("chassis='").append(chassis).append('\'');
        stringBuilder.append(", wheels='").append(wheels).append('\'');
        stringBuilder.append(", engine='").append(engine).append('\'');
        stringBuilder.append(", insideDesign='").append(insideDesign).append('\'');
        stringBuilder.append(", additives='").append(additives).append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
