package cts.design_patterns.adapter_pattern.example;

import cts.design_patterns.adapter_pattern.example.adapter_classes.AdapterKeyboard;
import cts.design_patterns.adapter_pattern.example.adapter_classes.MouseAdapter;
import cts.design_patterns.adapter_pattern.example.foreign_classes.Keyboard;
import cts.design_patterns.adapter_pattern.example.foreign_classes.Mouse;

public class Main {
    public static void main(String[] args) {
        // Foreign Classes
        Mouse mouse = new Mouse();
        Keyboard keyboard = new Keyboard();

        // I make a system specific for the mouse and specific for the foreign keyboard
        IGamingSystem mouseAdapter = new MouseAdapter(mouse);
        IGamingSystem keyBoardAdapter = new AdapterKeyboard(keyboard);

        // I use the application methods with the hidden implementation using foreign methods
        mouseAdapter.printConfiguration();
        keyBoardAdapter.printConfiguration();
    }
}
