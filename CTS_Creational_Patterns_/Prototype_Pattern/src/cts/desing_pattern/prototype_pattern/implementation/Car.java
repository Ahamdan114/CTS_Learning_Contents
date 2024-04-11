package cts.desing_pattern.prototype_pattern.implementation;

import java.util.ArrayList;

public class Car extends Vehicle {
    private String brand;
    private String model;
    private String color;
    private ArrayList<String> capabilities;

    private int topSpeed;

    public Car() {}

    public Car(String brand, String model, String color, ArrayList<String> capabilities, int topSpeed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.topSpeed = topSpeed;
        if(capabilities != null) this.capabilities = new ArrayList<>(capabilities);
    }

    public Car(Car car) {
        super(car);

        this.brand = car.brand;
        this.model = car.model;
        this.color = car.color;
        if(car.capabilities != null) this.capabilities = new ArrayList<>(car.capabilities);

        this.topSpeed = car.topSpeed;
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", capabilities=").append(capabilities);
        sb.append(", topSpeed='").append(topSpeed).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
