package cts.factory.pattern.implementation_abstract_factory;

public class MSIManufacturer extends Company {
    @Override
    protected Monitor createMonitor() {
        return new MSIMonitor();
    }

    @Override
    protected GPU createGPU() {
        GPU gpu = new MSIGPU();
        gpu.assemble();
        return gpu;
    }
}
