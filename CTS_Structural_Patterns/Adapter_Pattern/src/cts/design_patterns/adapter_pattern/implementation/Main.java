package cts.design_patterns.adapter_pattern.implementation;

public class Main {
    public static void main(String[] args) {

        ForeignImplementation foreignImplementation = new ForeignImplementation();

        ITargetInterface adapter = new ForeignToTargetAdapter(foreignImplementation);
        String data = "We have something else here";
        String dataAfter = null;

        adapter.printSomething(data);
        adapter.printSomething(dataAfter);
    }
}
