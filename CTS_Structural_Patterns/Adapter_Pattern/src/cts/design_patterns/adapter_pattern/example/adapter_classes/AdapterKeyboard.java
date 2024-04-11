package cts.design_patterns.adapter_pattern.example.adapter_classes;

import cts.design_patterns.adapter_pattern.example.IGamingSystem;
import cts.design_patterns.adapter_pattern.example.foreign_classes.Keyboard;

public class AdapterKeyboard implements IGamingSystem {
    private final Keyboard keyboard;


    public AdapterKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public void printConfiguration() {
        keyboard.connect();
    }
}
