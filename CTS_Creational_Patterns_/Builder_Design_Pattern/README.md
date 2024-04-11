# Pattern description
    Builder pattern is a widely used pattern in many ways. 
    It's role is to build complex and scalable blueprints for creating object.
    It's implementation is made in order to build at initialization objects with
    dinamyc atributes, specifically setted by the programmer.

# Use-case
    Everywhere where all data isn't always necessary. If there are mandatory things and optional things.
    The pattern organizes object construction into a set of steps.
    To create an object, you execute a series of these steps on a builder object.

# Reasons
    Some reasons to use it can be:
        Memory allocation 
            -> It provides a way to not implement many subclasses with their
            specific constructors for every tiny detail of the object, so we have
            less constructors and less classes, meaning less memory used.
        
        Frozen state.
            -> When implementing the builder pattern, the object instance becomes 
            immutable, meaning the state of data at the initialization is preserved.
        
        Thread safety
            -> In a multithread environment, the state is preserved when
            using builder because the instance cannot be modified, so it's
            easily shared.
        
        Flexible constructor
            -> builder provides a dynamic constructor which has only the necessary
            attributes and nothing more.

        Eager instantiation
            -> Builder is initialized when it's needed but can't be modified
            meaning that the object needs to be instantiated in advance with all
            necessary attributes.

        Separation of concerns
            -> The Builder pattern separates the construction of an object from 
            its representation. This separation allows for different implementations of 
            the builder to construct the same object with different representations, 
            providing flexibility and abstraction in the construction process.

# Real examples can be
        -> Functional programming ( Streams )
        -> StringBuilder
        -> Date constructor

# Resources necessary for builder
    You need 2 interfaces with classes, 2 classes for each interface.
    You need the access class, which is CarEngineer.

# Implementation steps
    You need 2 interfaces based on which you create.
        -> The interface for Abstract product ( in our case is CarTemplate ).
            -> Here we can have a regular car or a electrical car. ( Similarities inherited, differences added ).
        -> The interface for Abstract builder ( in our case is CarBuilder ).
            -> Here we can have a regular builder or a electrical builder. ( Similarities inherited, differences added ).
        -> Class engineer, which can be seen as the director which chooses the builder who creates.
            -> Here we can choose a RegularCarBuilder or ElectricalCarBuilder.
            -> We build the similarities ( methods from interfaces ), and with instanceof we build the differentiable parts ( not inherited methods ).

# Diagram (optional)
    Go to the diagram folder.