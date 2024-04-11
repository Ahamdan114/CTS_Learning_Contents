# Definition
    
    Adapter pattern is a structural pattern which resolves, respecting SOLID principles
    some compatibility issues regarding the use of third-party packages/modules in our
    application.

# Why do we need it
    
    We need it because adapting our application using an already built package
    full of features which we need is easier than actually implementing that package
    ourselves.
    
    Implementing another package, IF we have access to it's source code is
    costly and time-consuming.

    Implementing another package, IF WE DO NOT have access to it's source code is
    harder, almoust impossible due to it's architecture which needs to be learned
    as a whole.


# Examples in real world

    Language Translator Apps -> 
        Two people speak different languages.
        Take one language as input and make it compatible with the other.

    Frameworks and Libraries -> JDBC API
        When interacting to different DBMS, Java Database Connectivity API uses adapters.

# Implementation Details

    The TargetInterface is inherited by Adapter
    The ForeignImplementation has a composition with Adapter
    
    Implement TargetInterface methods with ForeignService methods.

# Implementation Steps
    
    See the implementation sub-package in src

# Resources necessary

    An target interface ( Which implicitly respects guidelines of our program ).
    A foreign class ( Which will be translated to our program guidelines ).

# Code Flow

    See it in ./resources/Structural_Pattern_Adapter_Flow.pdf

# Diagram

    See it in ./resources/Structural_Pattern_Adapter_Diagram.png

# Further understanding
    
    Video: https://www.youtube.com/watch?v=wA3keqCeKtM