package cts.factory.pattern.example;

public abstract class Spectacol {
    String name;
    String location;
    String appointedTime;

    protected Spectacol(String name, String location, String appointedTime) {
        this.name = name;
        this.location = location;
        this.appointedTime = appointedTime;
    }


    public IShow orderPromotion() {
        IShow showPromotion = this.createPromotion();
        return showPromotion;
    }


    protected abstract IShow createPromotion();
}
