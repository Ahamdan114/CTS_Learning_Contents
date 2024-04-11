import cts.desing_pattern.prototype_pattern.implementation.Bus;
import cts.desing_pattern.prototype_pattern.implementation.Car;
import cts.desing_pattern.prototype_pattern.implementation.Vehicle;
import cts.desing_pattern.prototype_pattern.implementation.VehicleCache;

import java.util.ArrayList;
import java.util.Arrays;

public class MainAnother {
    public static void main(String[] args) {
        VehicleCache cache = new VehicleCache();
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Coboara geamul", "Coboara jaluzeaua"));

        Vehicle car = new Car("BMW", "16RK", "red", list, 110);
        Vehicle bus = new Bus("Audi", "32RK", "black", list, 110);
        cache.add("car", car);
        cache.add("bus", bus);

        Vehicle anotherCar = car.clone();
        System.out.println(anotherCar.toString());
        System.out.println(bus.toString());

        System.out.println();
        System.out.println(cache);
    }
}