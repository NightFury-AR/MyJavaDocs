What is JVM ?

- JVM is ❤ of the Java Program. without JVM we cannot run the Java Program.
- It is the Abstract Machine 👀 . it has it own instruction about how to handle the memory at run time like physical machine.
  but its a <span style="color:green">**Virtual**</span> machine.
  
Need of JVM 

- it makes the java code to run anywhere ✈🛫🛬🛰🛸. (write once run anywhere).
- its runs your program in very secure environment🔒 .i.e it prevents from malicious code injection.
- its takes care of Memory Management and Optimizations🚀 (JIT compiler and Garbage Collector).
- it verifies the byte code to avoid any malicious attacks.

where is the JVM👽 ?
<<image>>


**PC Register**
- The Program Counter (PC) register stores the address of  the currently executing instruction. For each thread, the content of the PC register is updated whenever an instruction is executed by the JVM.


**JVM Stack**
- The JVM stack is used to store local variables, intermediate results and data related to method invocation and return. The size of a JVM stack may be fixed or dynamic. The data in a stack is stored in the form of frames. Push and pop operations can be performed on the stack frames to manipulate data.

**Method Area**  
- Method area holds class-level data for each class loaded such as type information of fields and methods, byte code of the methods, static variables, run-time constant pool, etc. The method area is usually a logical part of heap memory and is shared amongst all the threads. Like heap memory, the method area also gets created when the JVM is started.

**Heap**  
- Heap is used to hold the instances of Java classes. Unlike stack, heap memory is shared by all the JVM threads. The heap size is managed automatically with the help of "Garbage collector".

**Native Method Stacks**  
- Native method stacks are used by JVM to support native methods. The  term native method in Java refers to any method written in a language other than Java.

**Garbage collector**
- Garbage Collector is used by the Execution Engine to replace explicit deallocation of objects. The Garbage Collector automatically considers the unreferenced objects in the heap as garbage and reclaims the memory.


more details : 
https://www.freecodecamp.org/news/jvm-tutorial-java-virtual-machine-architecture-explained-for-beginners/

<span style="color:yellow;">***JVM Memory***</span>
***** 
**Stack**
- Temporary memory area used by JVM. JVM stores the local variables, intermediate results , Method invocation , return values here.
- sine java program runs in multi-thread environment. so each created thread will be assigned to separate thread.  
  **Frame** :
  - whenever new method called a new block called Frame created in stack area.
  - this frame will hold the state of it invoke method properties.
  - it will contain
    1.Array of local variables of the associated methods.
    2.Operand stacks to hold intermediate values.
    3.A reference to the run-time constant pool of current method class.
    e.g : <span style="color:red;">**e.printStackTrace()**</span> - this will give us error details from each stack.

**Heap Memory**
- This Memory used to store java objects and JRE classes at runtime. so that JVM can use it whenver required.
- Heap is divided into 2 phases,  
  1.Young Generation  
  2.Old generation


- all new objects generated in young generation sections. young genration consists 3 sections. namely , a)eden space b)survivor 1 c)survivor 2
- eden space- initial pool from which memory is allocated to objects.
- survivor 1 , 2 - these are equal pools contains the objects that garbaged from eden space.
- old generation = young generation objects which are exceeds it age will be shifted here. .i.e long survivng objects.
- permanent generation = it holds JVM related objects like J2SE class and objects.


