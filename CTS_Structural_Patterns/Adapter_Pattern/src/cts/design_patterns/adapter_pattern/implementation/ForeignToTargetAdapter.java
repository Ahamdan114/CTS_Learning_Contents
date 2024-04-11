package cts.design_patterns.adapter_pattern.implementation;

// The middle class between the Foreign CLASS and Target INTERFACE which
// implements the Target INTERFACE using the Foreign CLASS methods.

// It can be seen as: We adapt Foreign class to our guidelines, which are the interface methods
public class ForeignToTargetAdapter implements ITargetInterface {
    private final ForeignImplementation foreignImplementation;

    public ForeignToTargetAdapter(ForeignImplementation foreignImplementation) {
        this.foreignImplementation = foreignImplementation;
    }

    @Override // Here we use foreign methods to make ITargetInterface methods compatible/adapted to our needs.
    public void printSomething(String outsideData) {
        Integer innerData;
        String notFoundMessage = "Error 404: Data not found";

        if(outsideData != null) innerData = outsideData.hashCode();
        else innerData = notFoundMessage.hashCode();
        foreignImplementation.printSomethingElse(innerData);
    }
}
