package cts.desing_pattern.prototype_pattern.implementation;

import java.util.ArrayList;

public class Bus extends Vehicle {

    private String brand;
    private String model;
    private String color;
    private ArrayList<String> capabilities;

    int noWheels;

    public Bus() {}

    protected Bus(Bus bus) {
        super(bus);

        this.brand = bus.brand;
        this.model = bus.model;
        this.color = bus.color;
        if(bus.capabilities != null) this.capabilities = new ArrayList<>(bus.capabilities);

        this.noWheels = bus.noWheels;
    }

    public Bus(String brand, String model, String color, ArrayList<String> capabilities, int noWheels) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        if(capabilities != null) this.capabilities = new ArrayList<>(capabilities);
        this.noWheels = noWheels;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bus{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", capabilities=").append(capabilities);
        sb.append(", noWheels=").append(noWheels);
        sb.append('}');
        return sb.toString();
    }
}
