package cts.factory.pattern.example;

import java.util.ArrayList;

public class Concert extends Spectacol {
    String musicalStyle;
    ArrayList<String> artists;

    public Concert(String name, String location, String appointedTime, String musicalStyle, ArrayList<String> artists) {
        super(name, location, appointedTime);

        this.musicalStyle = musicalStyle;
        this.artists = new ArrayList<String>(artists);
    }

    @Override
    protected IShow createPromotion() {
        return new ConcertPromotion(name, location, appointedTime);
    }
}
