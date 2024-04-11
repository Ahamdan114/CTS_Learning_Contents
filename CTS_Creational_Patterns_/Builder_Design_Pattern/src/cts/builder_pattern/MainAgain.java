package cts.builder_pattern;

import cts.builder_pattern.example.initial.GamingSystem;
import cts.builder_pattern.example.initial.GamingSystemBuilder;

public class MainAgain {
    public static void main(String[] args) {
        GamingSystemBuilder builder = new GamingSystemBuilder("placa", "memorie", "stocare", "video")
                .setCasti("casti").setScaunGaming("scaun");
        GamingSystem system = builder.build();
        system.printConfiguration();
    }
}
