## <span style="color:orange">***Object-Oriented Programming Structure***</span>  
****

below are the four pillars🏛🏛🏛🏛 of <span style="color:orange">**OOPS**</span> programming.

- Abstraction
- Encapsulation
- Inheritance
- Polymorphism

1.Abstraction is the process of showing only essential/necessary features of an entity/object to the outside world and hide the other irrelevant information. For example to open your TV we only have a power button, It is not required to understand how infra-red waves are getting generated in TV remote control.  

2.Encapsulation : Encapsulation means wrapping up data and member function (Method) together into a single unit i.e. class. Encapsulation automatically achieve the concept of data hiding providing security to data by making the variable as private and expose the property to access the private data which would be public.

3.Inheritance : The ability of creating a new class from an existing class. Inheritance is when an object acquires the property of another object. Inheritance allows a class (subclass) to acquire the properties and behavior of another class (super-class). It helps to reuse, customize and enhance the existing code. So it helps to write a code accurately and reduce the development time.

4.Polymorphism: Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means "many forms". A subclass can define its own unique behavior and still share the same functionalities or behavior of its parent/base class. A subclass can have their own behavior and share some of its behavior from its parent class not the other way around. A parent class cannot have the behavior of its subclass.

Apart from these concepts, there are some other terms which are used in Object-Oriented design:

- Coupling  
- Cohesion 
- Association  
- Aggregation  
- Composition  

[**Coupling**](https://www.geeksforgeeks.org/coupling-in-java/)

- Coupling refers to the knowledge or information or dependency of another class. It arises when classes are aware of each other. If a class has the details information of another class, there is strong coupling. In Java, we use private, protected, and public modifiers to display the visibility level of a class, method, and field. You can use interfaces for the weaker coupling because there is no concrete implementation. 

[**Cohesion**](https://www.geeksforgeeks.org/cohesion-in-java/)   
- Cohesion refers to the level of a component which performs a single well-defined task. A single well-defined task is done by a highly cohesive method. The weakly cohesive method will split the task into separate parts. The java.io package is a highly cohesive package because it has I/O related classes and interface. However, the java.util package is a weakly cohesive package because it has unrelated classes and interfaces.

[**Association**](https://www.geeksforgeeks.org/association-composition-aggregation-java/)  
- Association represents the relationship between the objects. Here, one object can be associated with one object or many objects. There can be four types of association between the objects:
    - One to One
    - One to Many
    - Many to One, and
    - Many to Many  
    
Let's understand the relationship with real-time examples. For example, One country can have one prime minister (one to one), and a prime minister can have many ministers (one to many). Also, many MP's can have one prime minister (many to one), and many ministers can have many departments (many to many).

Association can be un-directional or bidirectional.

[**Aggregation**](https://www.geeksforgeeks.org/association-composition-aggregation-java/) 
- Aggregation is a way to achieve Association. Aggregation represents the relationship where one object contains other objects as a part of its state. It represents the weak relationship between objects. It is also termed as a has-a relationship in Java. Like, inheritance represents the is-a relationship. It is another way to reuse objects.

[**Composition**](https://www.geeksforgeeks.org/association-composition-aggregation-java/)
- The composition is also a way to achieve Association. The composition represents the relationship where one object contains other objects as a part of its state. There is a strong relationship between the containing object and the dependent object. It is the state where containing objects do not have an independent existence. If you delete the parent object, all the child objects will be deleted automatically.

[reference](https://www.javatpoint.com/java-oops-concepts)