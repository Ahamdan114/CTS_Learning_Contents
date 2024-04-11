package cts.factory.pattern.example;

public class StandupPromotion implements IShow {
    String name;
    String location;
    String appointedTime;

    StandupPromotion(String name, String location, String appointedTime) {
        this.name = name;
        this.location = location;
        this.appointedTime = appointedTime;
    }

    @Override
    public void printDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public String getDateTime() {
        return this.appointedTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StandupPromotion{");
        sb.append("name='").append(name).append('\'');
        sb.append(", location='").append(location).append('\'');
        sb.append(", appointedTime='").append(appointedTime).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
