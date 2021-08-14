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


