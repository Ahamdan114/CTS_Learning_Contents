package cts.builder_pattern.implementation.product;

public interface CarTemplate {
    public void reset();
    public void setChassis(String chassis);
    public void setWheels(String wheels);
    public void setEngine(String engine);
    public void setInsideDesign(String insideDesign);
    public String showDetails();
}
