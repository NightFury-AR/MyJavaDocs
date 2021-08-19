### <span style="color:orange">Java Generics</span> 
[Oracle Docs -Generic](https://docs.oracle.com/javase/tutorial/java/generics/why.html)

[Genric concepts Doc](https://www.tutorialspoint.com/java_generics/java_generics_classes.htm)
****

In java , like method parameters (int,string,float). we can also use class,interface and objects type with the help of generics.

why we need ? 

for example see the below non-generic class

```java
public class VehicleProducerFactory {
    //vehicles object
    private Object vehicle;
    
    //setter
    public void sendOrder(Object objectFromUser) {
        this.vehicle = objectFromuser;
    }
    //getter
    public Object deliverTheVehicle() {
        return vehicle;
    }
    public static void main() {
        VehicleProducerFactory f = new VehicleProducerFactory();
        f.sendOrder(Van);
        f.deliverTheVehicle();//we will get van
    }
}
```
from the above example VehicleProducerFactory doesn't check the user orders.

if we ordered any machines , then vehicle factory is gone. it can only produce the vehicles type of vehicle object.

```java
public static void main() {
        VehicleProducerFactory f = new VehicleProducerFactory();
        f.sendOrder(MachineGun);
        f.deliverTheVehicle();//oh my !. 
        // factory exploded. 
        // you should only ask me to produce vehicle.
        // but you are asking machineGun🥵
        //i'm exploded now😪
    }
```

![non-generic](https://user-images.githubusercontent.com/72085278/129718920-64fde34c-e194-4e33-abb3-a6e5befa127d.JPG)

so the above scenario cause runtime errors.

to overcome this we can use generics.

**Benefits**

- Stronger Type checks at compile time.
- Eliminations of cast.
- Enable us to implement own generic Algorithms.

The most commonly used type parameter names are,

| name | description |
|:----:|:---------:|
|E| Element (used extensively by the Java Collections Framework)|
|K| Key|
|N|Number|
|T|Type|
|V|Value|
|S,U,V,etc.|2rd ,3rd,4th types|

so now we can re-create the above class as generic.

```java
public class VehicleProducerFactory<T> {
    //vehicles object
    private T vehicle;
    
    //setter
    public void sendOrder(T objectFromUser) {
        this.vehicle = objectFromuser;
    }
    //getter
    public T deliverTheVehicle() {
        return vehicle;
    }
    public static void main() {
        VehicleProducerFactory<Vehicle> f = new VehicleProducerFactory<Vehicle>();
        f.sendOrder(Van);
        f.deliverTheVehicle();//we will get van
    }
}
```

now if try to create machineGun from VehicleProducerFactory, we will get type error at compile time itself.

.i.e. this class only accepts vehicle type objects.


![generics](https://user-images.githubusercontent.com/72085278/129719343-b856a2c1-f984-44b0-b973-16ea652c0e4d.JPG)

**The Diamond** 💎😁

from Java 7, you can use <> operator like this,

```java
VehicleProducerFactory<Vehicle> = new VehicleProducerFactory<>
```
no need to specify type in object. only reference type is feasible.

**How to Pass Multiple Type parameters ?**

lets say, if want to produce the vehicle with color. how to we implement ?

first we will create a interface for specs
```java
public interface VehicleSpecs<Vehicle,Color> {
    public void getVehicle();
    public void getColor();
}
```

generic class

```java
public class VehicleProducerFactory<K,V> implements VehicleSpecs<K,V> {
    //vehicles object
    private K vehicle;
    private V color;

    //setter
    public void sendOrder(K vehicle,V color) {
        this.vehicle = vehicle;
        this.color = color;
    }
    //getter
    public K getTheVehicle() {
        return vehicle;
    }
    public V getTheColor() {
        return color;
    }
    public static void main() {
        VehicleProducerFactory<Vehicle,Color> f = new VehicleProducerFactory<>();
        f.sendOrder(Van,ArmyGreen);
        f.getTheColor();
        f.getTheVehicle();
    }
}
```
**Parameterized Types**

we can also use the parameterized types like below

```java


class A {
    public static void main(String args[]) {
        TesCompany<Model, VehicleProducer<Vehicle, Color>> tc = new TesCompany<>("M2",new VehicleProducer<Vehicle,Color>("Car","black"));
        //tescompany with (model,carspecs(car,green))
    }
}
```

Raw Type 

when you use a generic class Box<Integer> b = new Box<>(); instead of Box b = new Box() then its called raw type to support legacy code.


**Generic Methods**

like generic class we can also use generic methods like below.

```java
public <K,V> void changeOrder(K newKey,V newValue) {
        System.out.println("order changed : "+newKey+" "+newValue);
    }
//calling method
        //different param <int,int>
         v.<>changeOrder(10002,22222);
        //different param<string,int>
        v.<String,Integer>changeOrder("Hello",12);
        //different param <string,string>
        v.<String,String>changeOrder("hi","hello");
```

**Bounded Type**

see example JavaGenerics04.java

**Generic Methods and Bounded Type Parameters**

Bounded type parameters are key to the implementation of generic algorithms.

**Wildcards** 

-> [when to use wildcards ? when to use genric types ?](https://stackoverflow.com/questions/18176594/when-to-use-generic-methods-and-when-to-use-wild-card)


