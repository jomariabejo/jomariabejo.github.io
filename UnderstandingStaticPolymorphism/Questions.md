# Questions
<ul>
    <li>1. After analyzing the code and running the example, answer the following questions:</li>
    <li>2. How many add methods are there in the Calculator class, and what are the differences in their parameter lists?</li>
    <li>3. In the main method, when you call calculator.add(5, 3), which add method is invoked, and why?</li>
    <li>4. When you call calculator.add(2.5, 4.7), which add method is invoked, and why?</li>
    <li>5. What is the output of the program, and how does it demonstrate static polymorphism?</li>
</ul>

# Answers
<ul>
    <li>1. Understood</li>
    <li>2. There is only three "add" methods, the differences in their parameter is the data type
        <h6>INTEGER, INTEGER</h6>
        <h6>DOUBLE, DOUBLE</h6>
        <h6>STRING, STRING</h6>
    </li>
    <li>3-4. When calling calculator.add(2.5, 4.7), it invokes the 'add' method that accepts Double parameters for both the first and second parameters. This decision is made during compile-time due to static polymorphism. Static polymorphism, also known as method overloading, allows the compiler to determine the appropriate method to invoke based on the number and types of parameters provided. In this case, as the input values are of type Double, the compiler selects the 'add' method that precisely matches this parameter type signature. If there is no exact match for the provided data types, the compiler would raise a compile-time error, ensuring type safety and preventing runtime exceptions such as NumberFormatException.</li>
    <li>  5. The output of the program should indeed be <b>7.2</b>, as it represents the sum of the double values 2.5 and 4.7. This program demonstrates static polymorphism through method overloading. Static polymorphism allows the program to provide multiple versions of the add method, each accepting different parameter types. In this specific case, the add method with parameters of type double is invoked, showcasing how static polymorphism enables the selection of the appropriate method at compile-time based on the provided arguments. This enhances code readability and flexibility without the need for explicit type conversion, further exemplifying the benefits of method overloading and static polymorphism in Java.</li>
</ul>