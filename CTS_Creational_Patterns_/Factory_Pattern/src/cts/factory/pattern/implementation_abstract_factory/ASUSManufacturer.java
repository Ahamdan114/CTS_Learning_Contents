package cts.factory.pattern.implementation_abstract_factory;

public class ASUSManufacturer extends Company {

    @Override
    protected Monitor createMonitor() { return new ASUSMonitor(); }

    @Override
    protected GPU createGPU() {
        return new ASUSGPU();
    }
}
