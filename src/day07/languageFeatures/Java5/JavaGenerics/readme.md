## Generics
<hr/>

in java , generics used for type safety.

main advantages of generics are ,
- Type Safety
- Type Casting Not Required
- Compile Time checking

without generics ,
```java
        List list = new ArrayList();
        list.add(10);
        list.add("10");
```
With Generics, it is required to specify the type of object we need to store.
```java
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add("10");// compile-time error  
```

Creating a generic class:
````java
class MyGen<T> {  
T obj;  
void add(T obj){this.obj=obj;}  
T get(){return obj;}  
}  
````

### Type Parameters

The type parameters naming conventions are important to learn generics thoroughly. The common type parameters are as follows:

T - Type  
E - Element  
K - Key  
N - Number  
V - Value  

we can also create generic methods ,

```java
public static < E > void printArray(E[] elements) {  
        for ( E element : elements){          
            System.out.println(element );  
         }  
         System.out.println();  
    }  
```

### Wildcard in Java Generics
- The ? (question mark) symbol represents the wildcard element. It means any type. If we write <? extends Number>, it means any child class of Number, e.g., Integer, Float, and double. Now we can call the method of Number class through any child class object.

- We can use a wildcard as a type of a <b> parameter, field, return type, or local variable. However, it is not allowed to use a wildcard as a type argument for a generic method invocation, a generic class instance creation, or a supertype.</b>

#### Upper Bound wildcards

- List <? extends Number>

#### Unbounded Wildcards
- The unbounded wildcard type represents the list of an unknown type such as List<?>. This approach can be useful in the following scenarios: 
- When the given method is implemented by using the functionality provided in the Object class.
- When the generic class contains the methods that don't depend on the type parameter.

#### Lower Bound wildcards 
- The purpose of lower bounded wildcards is to restrict the unknown type to be a specific type or a supertype of that type. It is used by declaring wildcard character ("?") followed by the super keyword, followed by its lower bound.
- List<? super Integer>




