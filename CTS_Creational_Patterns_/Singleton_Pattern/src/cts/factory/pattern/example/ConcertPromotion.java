package cts.factory.pattern.example;

public class ConcertPromotion implements IShow {
    String name;
    String location;
    String appointedTime;

    ConcertPromotion(String name, String location, String appointedTime) {
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
        final StringBuilder sb = new StringBuilder("ConcertPromotion{");
        sb.append("name='").append(name).append('\'');
        sb.append(", location='").append(location).append('\'');
        sb.append(", appointedTime='").append(appointedTime).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
