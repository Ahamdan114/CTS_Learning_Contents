package cts.factory.pattern.implementation_abstract_factory;

public class ASUSMonitor implements Monitor {
    ASUSMonitor() {}

    @Override
    public void assemble() {
        // code for assembling monitor
        System.out.println("Assemble ASUSMonitor");
    }
}
