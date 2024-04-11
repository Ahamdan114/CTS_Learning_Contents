# Pattern description

    Prototype pattern is a technique used to copy objects
    efficiently and organize them in an efficient and
    scalable way, respecting in the same time the SOLID
    principles.

# Reasons

    -> Usually it takes alot of time to deep copy an
    object, if you know it's structure and it's class.

    -> It becomes harder if attributes are not accessible to
    you or you don't even have the class, only the interface
    of that object.

    -> In the most cases, where only the interface is given
    is important to take into consideration the structure of
    the subclasses which implement that interface.

    -> The hierarchy of connections between objects is
    preserved.

    -> Read-only objects can be copied without affecting
    in the process the source object.

# Real Examples

    -> Cloneable interface.
    -> Copying and downloading documents from different
    platforms.
    -> Having a template with specific configurations which
    needs to be preserved.

# Resources necessary for prototype

    -> Prototype interface.
    -> Base class.
    -> Subclasses of base. ( if the case )
    -> A registry/catalogue class for different objects.

    -> So, in total 1 interface and 2 or more classes

# Details

    -> Prototype interface ( with clone method ).
    -> Base class ( implementing clone method ).
    -> Subclasses ( implementing if necessary the clone method ).
    -> A registry where all prototype templates are kept and reused.

# Implementation steps
    
    -> See in 
    ./src/cts/desing_pattern/prototype_pattern/implementation

    The implementation steps consists firstly in creating
    a method clone, either in an interface or an abstract
    class.
    
    Then, the abstract class and the subclasses inherit this method
    and implements it. If there are reference attributes, such as
    data structures, then check for nullability.
    
    Finally, a registry with the ability to add and retrieve clones
    of objects for scalability is added. ( Here it's important to
    implement factory pattern if the application is scalable ).
    

# Diagram (optional)

    See in ./resources/prototype_implementation.png
