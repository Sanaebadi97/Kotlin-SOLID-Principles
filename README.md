# Kotlin-SOLID-Principles


S.O.L.I.D Principles KOTLIN (Android)

The following 5 concepts make up our SOLID principles:

- Single Responsibility

- Open/Closed

- Liskov Substitution

- Interface Segregation

- Dependency Inversion


1-A class should have only one reason to change.

2.software entities (classes, modules, functions, etc) should be open for extension, but closed for modification

3.Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program.



4.Make fine grained interfaces that are client-specific.

4-1 -Many client-specific interfaces are better
than one general purpose interface.



5-a. High-level modules should not depend on low-level modules. Both should depend on abstractions.

5.b. Abstractions should not depend on details. Details should depend on abstractions.

Put succinctly, the Dependency Inversion Principle basically says this:

Depend on Abstractions. Do not depend on concretions.



In a traditional layered pattern software architecture design, higher level modules depend on lower level modules to do their 
job. For example, here’s a very common layered architecture that you may have seen (or may even have in your application now):


Android UI → Business Rules → Data Layer

In the diagram above there are three layers. The UI Layer (in this case, the Android UI) - this is where all of our UI widgets, 
lists, text views, animations and anything Android UI-related lives. Next, there is the business layer. In this layer, common 

business rules are implemented to support the core application functionality. This is sometimes also known as a “Domain Layer” 

