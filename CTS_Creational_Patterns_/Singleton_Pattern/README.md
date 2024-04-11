# Pattern description
    Singleton pattern is a widely used pattern in many ways. 
    It's role is to create a single object for a class and only one.

# Reasons
    Some reasons to use it can be:
        Memory allocation 
            -> If one instance is used, there is less overall memory.
        
        Global state.
            -> If a state is needed on the entire application's lifetime
            singleton can assure that the state is preserved.
        
        Thread safety
            -> In a multithread environment, the state is preserved when
            using singleton.
        
        Lazy instantiation
            -> Singleton is used only when it's necessary.

        Encapsulation
            -> Regarding security and implmentation details, singleton
            offers a point of access ( and unfortunately a point of fail also )
            which is abstractized for the other people who need just
            general information.
# Real Examples
    Real examples can be
        -> A database connection ( resource access in a multithread app and speed ).
        -> A scanner for products ( resource access in a multithread app and speed ).
        -> Modules and packaged ( unique name ).

# Resources necessary for singleton
    -> A private single instance object reference. ( has-a relation ).
    -> An access getter method.

# Details
    -> Instance needs to be private, volatile and static.
    -> Method needs to be public, synchronized, static.
    -> Setters are not allowed ( for intelisense implement methods )
# Implementation steps
        Write a class 
        then static write instance with type of class 
        then static getter instance.
        
# Diagram (optional)
    Not yet