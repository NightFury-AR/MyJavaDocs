## <span style="color:orange"> Java Collections </span>
****

[Oracle Docs Link](https://docs.oracle.com/javase/8/docs/api/?java/util/Collections.html) 😋


The Java Collections API provide Java developers with a set of classes and interfaces that makes it easier to work with collections of objects, e.g. lists, maps, stacks etc.

Rather than having to write your own collection classes, Java provides these ready-to-use collection classes for you.

<center>

![CollectionsCircle](https://user-images.githubusercontent.com/72085278/132675990-d8a77986-c67c-4fa0-9012-ae19d043c982.JPG)

</center>

**Java Collection**

The Java Collection interface represents the operations possible on a generic collection, like on a List, Set, Stack, Queue and Deque. For instance, methods to access the elements based on their index are available in the Java Collection interface.

**List**

The Java List interface represents an ordered collection of objects. By ordered means, that you can access the elements in the order they occur in the list

**Queue**

The Java Queue interface represents a classical queue data structure, where objects are inserted into one end of the queue, and taken off the queue in the other end of the queue. This is the opposite of how you use a stack. 

**Dequeue**

The Java Set interface represents an unordered collection of objects. Unlike the List, a Set does not allow you to access the elements of a Set in any guaranteed order. There are Set implementations that order elements based on their natural ordering, but the Set interface itself provides no such guarantees

**Set**

The Java Deque interface represents a double ended queue, meaning a data structure where you can insert and remove elements from both ends of the queue. I guess you could have called it a double ended stack too.

**Map**

A map is a data structure which supports the key-value pair mapping for the data. This interface doesn’t support duplicate keys because the same key cannot have multiple mappings. A map is useful if there is a data and we wish to perform operations on the basis of the key.

Simple article : [Java Collections](https://www.geeksforgeeks.org/collections-in-java-2/)

<center>

<span style="color:white;background-color:black;display:flex;padding:10px;">Once you mastered the collections API then you will use this below diagram to choose the right collection </span>

![collection-cheat](https://user-images.githubusercontent.com/72085278/130075279-af7eb318-2178-4e94-be34-f46314e71d5c.jpeg)

</center>

##Extras 
