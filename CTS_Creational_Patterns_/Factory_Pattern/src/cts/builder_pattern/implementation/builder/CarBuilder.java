package cts.builder_pattern.implementation.builder;

import cts.builder_pattern.implementation.product.CarTemplate;

public interface CarBuilder {
    public void buildChassis(String sasiu);
    public void buildWheels(String roti);
    public void buildInteriorDesign(String designInterior);
    public void buildEngine(String motor);

    public CarTemplate getCar();
}
