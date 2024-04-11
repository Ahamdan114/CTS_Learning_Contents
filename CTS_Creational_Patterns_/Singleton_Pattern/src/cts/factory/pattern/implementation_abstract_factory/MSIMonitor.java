package cts.factory.pattern.implementation_abstract_factory;

public class MSIMonitor implements Monitor {
    MSIMonitor() {}

    @Override
    public void assemble() {
        System.out.println("Assemble MSIMonitor");
        // code for assembling monitor
    }
}
