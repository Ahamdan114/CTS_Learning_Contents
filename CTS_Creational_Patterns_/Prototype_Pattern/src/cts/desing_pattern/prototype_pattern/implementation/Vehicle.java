package cts.desing_pattern.prototype_pattern.implementation;

import java.util.ArrayList;

public class Vehicle implements Cloneable {
    private String brand;
    private String model;
    private String color;

    private ArrayList<String> capabilities;

    public Vehicle() {}

    protected Vehicle(Vehicle vehicle) {
        if(vehicle == null) return;

        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
        if(vehicle.capabilities != null) this.capabilities = new ArrayList<>(vehicle.capabilities);
    }

    @Override
    public Vehicle clone() {
        return new Vehicle(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicle{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", capabilities=").append(capabilities);
        sb.append('}');
        return sb.toString();
    }
}
