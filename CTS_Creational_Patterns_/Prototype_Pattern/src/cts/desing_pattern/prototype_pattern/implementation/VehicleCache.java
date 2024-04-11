package cts.desing_pattern.prototype_pattern.implementation;

import java.util.HashMap;
import java.util.Map;

public class VehicleCache {
    Map<String, Vehicle> cache = new HashMap<>();

    public VehicleCache() {}

    public void add(String key, Vehicle obj) {
        cache.put(key, obj);
    }

    public Vehicle get(String key) {
        if(cache.get(key) == null) cache.put(key, this.createVehicle(key));
        return cache.get(key).clone();
    }

    public Vehicle createVehicle(String key) {
        if ("car".equalsIgnoreCase(key)) return new Car();
        else if ("bus".equalsIgnoreCase(key)) return new Bus();

        throw new IllegalArgumentException("Unknown key: " + key);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VehicleCache{");
        sb.append("cache=").append(cache);
        sb.append('}');
        return sb.toString();
    }
}
