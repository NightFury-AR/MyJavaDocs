<span style="color:orange">**Java Abstraction**</span>
****

In java, abstraction has been implemented using 2 ways 
1. abstract class (0% to 100%)
2. interface (100%)

- when you want to 100% abstraction then go with <span style="color:green"> **Interface** </span>  
- when you want some partial abstraction, then you can use <span style="color:green"> **abstract** </span> classes.

**Abstract class**  

1. An abstract class is a class that is declared with abstract keyword.
2. An abstract method is a method that is declared without implementation.
3. An abstract class may or may not have all abstract methods. Some of them can be concrete methods
4. A method defined abstract must always be redefined in the subclass, thus making overriding compulsory OR either make subclass itself abstract.
5. Any class that contains one or more abstract methods must also be declared with abstract keyword.
6. There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator.
7. An abstract class can have parameterized constructors and default constructor is always present in an abstract class.

[some abstract class Q & A](https://www.scientecheasy.com/2021/02/abstract-class-interview-questions.html/)

**Interface**

- An interface in Java is a blueprint of a class. It has static constants and abstract methods.

- The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. 

- It is used to achieve abstraction and multiple inheritance in Java.

- In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.

- Java Interface also represents the **IS-A** relationship.


