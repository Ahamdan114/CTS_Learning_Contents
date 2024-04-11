package cts.factory.pattern.implementation_abstract_factory;

public abstract class Company {
    public Monitor orderMonitor() {
        Monitor monitor = this.createMonitor();
        return monitor;
    }

    public GPU orderGPU() {
        GPU gpu = this.createGPU();
        return gpu;
    }

    protected abstract Monitor createMonitor();
    protected abstract GPU createGPU();
}
