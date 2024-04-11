package cts.singleton.pattern.implementation;

public class Singleton {
    // Here we have the address of a Singleton obj
    // It's useful for the case where we want to implement a single linkedlist. Storing the address of the next Singleton.
    // Volatile keyword is used for multithread real-time update.
    private static volatile Singleton instance;

    // Private modifier. Accessible by Class, not by instance
    private Singleton() {}


    // Synchronized is used for not having race conditions.
    // A single instance is created once because with synchronized the same memory
    // can't be accessed in parallel. Only in sequential mode
    public synchronized static Singleton getInstance() {
        if(Singleton.instance == null) {
            isCreated(); // It's seen on the screen once.
            Singleton.instance = new Singleton();
        }
        return Singleton.instance;
    }

    private static void isCreated() {
        System.out.println("A new instance is created");
    }
}
