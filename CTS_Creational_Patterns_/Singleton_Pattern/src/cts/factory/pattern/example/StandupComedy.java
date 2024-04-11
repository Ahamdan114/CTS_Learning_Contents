package cts.factory.pattern.example;

import java.util.ArrayList;

public class StandupComedy extends Spectacol {
    boolean explicitLanguage;
    ArrayList<String> comedians;

    public StandupComedy(String name, String location, String appointedTime, boolean explicitLanguage, ArrayList<String> comedians) {
        super(name, location, appointedTime);

        this.explicitLanguage = explicitLanguage;
        this.comedians = comedians;
    }

    @Override
    protected IShow createPromotion() {
        return new StandupPromotion(name, location, appointedTime);
    }

}
