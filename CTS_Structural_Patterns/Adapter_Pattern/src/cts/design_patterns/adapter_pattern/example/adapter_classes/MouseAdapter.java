package cts.design_patterns.adapter_pattern.example.adapter_classes;


import cts.design_patterns.adapter_pattern.example.IGamingSystem;
import cts.design_patterns.adapter_pattern.example.foreign_classes.Mouse;

public class MouseAdapter implements IGamingSystem {
    private final Mouse mouse;

    public MouseAdapter(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public void printConfiguration() {
        mouse.connect();
    }
}
