package cts.design_patterns.adapter_pattern.implementation;


// The class which we want to use in our program with compatibility issues.
public class ForeignImplementation {
    void printSomethingElse(int data) {
        System.out.println("Our current understanding is: " + data);
    }
}
