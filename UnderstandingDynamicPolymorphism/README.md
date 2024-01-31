# Questions

1. How many classes are involved in this code snippet, and what are their names?
2. What is the purpose of the LibraryItem class?
3. How is dynamic polymorphism implemented in this code?
4. When you call `item1.checkout()` and `item2.checkout()`, which `checkout` method is invoked for each item, and why?
5. Describe the output of the program and explain how it demonstrates dynamic polymorphism.

# Answers
1. There are four classes involved in this code snippet. The `LibraryItem` class serves as the parent class, providing a blueprint for common properties and behaviors shared by all library items. The `Book` and `Magazine` classes are subclasses that inherit from LibraryItem, each specializing in its respective type of library item. Additionally, there is the `LibraryDemo` class, responsible for managing the main method and orchestrating the execution of the program. 
2. The purpose of the `LibraryItem` class is to encapsulate common attributes and behaviors shared by all items in the library. It effectively manages data related to the `title` of the item and its `checkoutperiod`.
3. The parent class has a `checkOut` print process, however the `Book` include the Author in `checkOut`. Meanwhile `Magazine` has the `Publisher` on its print `checkOut` process.
4. For `item1.checkOut()` is initialized as Book so it will invoke the `Book.checkOut()`
and `item2.checkOut()` is initialized as Magazine that will also invoke the `Magazine.checkOut()`.
5. Both subclasses of LibraryItem have different implementations for the checkout() process, which is also called overriding. The only difference is that the Book class has an author in its implementation, while the Magazine class has a publisher in its implementation. They also have distinct attributes. 