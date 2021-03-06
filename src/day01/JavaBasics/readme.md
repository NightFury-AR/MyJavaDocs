**Java Basics**
***
<span style="color:orange;padding:5px">**1.Simple Java Program**</span>  

**public static void main (string args[])** 

- public => access modifier 
- static => make this main functions as static (will see this later).
- void => return type , void means no return type. 
- main => function name .
- (string args[]) => string type of arrays can be passed as user inputs   
    **e.g**  javac hello.java
  
    java hello "hai" "how" => here "hai" and "how" are the arg1,arg2

<span style="color:orange;padding:5px">**2.Class and Objects**</span>

- classes are blueprint of the objects
- objects are actual product/outputs.

based on our example ,consider **ClassAndObject** class as a Radio. it defines how radio should look. like buttons , speakers and its functionalities like volume, channels,etc. 

so it defines the blueprint of the radio. but in the same example we have created objects (ClassAndObjects02 PhilipsRadio = new ClassAndObjects02()). here we are creating new Radio for the philips brand. like same, we can create any number of radios with different companies. but all radios functionality will be same.

<span style="color:orange;padding:5px">**3.Java Data Types**</span>

In java Data types are divided into 2 categories.   
- Primitive Types
- Non - Primitive Types 

| Primitive Types       | Non-Primitive Types |  
|-----------------------|:-----------:|  
| it holds the value of data item | it holds the memory address of the data item which data(object) is stored |  
| eg. int i = 0; | e.g MyClass myClass |  

**Primitive Type**
- **Boolean**
  - boolean ( boolean b = true; )
- **Numerical**
  - Character
    - char (char ch = 'a';)
  - Integral
    - Integer
      - byte (byte b = 127;)
      - short ( short srt = 1200; )
      - int (int x = 10;)
      - long (long l = 12L;)
    - Floating Point
      - float (float f = 2.0f;)
      - double ( double d = 1202232323; )
    
**Non-Primitive Type**
- These data types created by the programmer (user-defined data types).
- They hold reference values. e.g., String,Array,instance variables,enums

**Java Enums**

A Java Enum is a special Java type used to define collections of constants. More precisely, a Java enum type is a special kind of Java class.

more details : [Java Enum Ref](http://tutorials.jenkov.com/java/enums.html)

check the below examples to understand the enum.

- JavaEnum04 - Defining, Assigning, Printing.
- JavaEnum05 - Implementing Enum with fields and methods.
- JavaEnum06 - Enums with abstract methods
- JavaEnum07 - Enums with EnumSet,EnumMap

**Scope of Variables**
- Local Variables : Variables declared inside the methods,loops,constructor or blocks. we can't use outside.
- Instance Variables : Instance variables declared inside the class and can be used outside class with the class object only.
- Static Variables : The scope of static variables is also within the class. All the methods, constructors, and blocks within class can access static variables by using the class name.


**Type Conversion or Type Casting**

- Widening conversion / implicit type casting
- Narrowing conversion / explicit type casting 

**Widening conversion** : Converting a variable of smaller datatype to the larger datatype, without data loss is known as widening conversion.

**Narrowing conversion** : Converting a variable of larger datatype to the smaller datatype, with some data loss is known as narrowing conversion.

**Loops** 
- Conditional flow
- looping

- if,if,else if,...else,switch are conditional flow statements
- for loop, while loops are looping statements in java.

see JavaLoops11 example for more details.

**Arrays**

Arrays are like trays. you can store simultaneous data types nto single array.

e.g., tray = [cup,cup,cup,cup]

syntax : <datatype> name[] = {value1,value2....n};

see the JavaArrays12 for more details.

