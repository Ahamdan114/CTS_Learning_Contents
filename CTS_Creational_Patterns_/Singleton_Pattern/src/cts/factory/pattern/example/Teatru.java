package cts.factory.pattern.example;

import java.util.ArrayList;

public class Teatru extends Spectacol {

    ArrayList<String> regizori;
    ArrayList<String> actori;

    public Teatru(String name, String location, String appointedTime, ArrayList<String> regizori, ArrayList<String> actori) {
        super(name, location, appointedTime);

        this.regizori = new ArrayList<String>(regizori);
        this.actori = new ArrayList<String>(actori);
    }

    @Override
    protected IShow createPromotion() {
        return new TheaterPromotion(this.name, this.location, this.appointedTime);
    }
}
