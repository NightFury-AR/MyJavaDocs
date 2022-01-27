### Annotations

### Built-In Annotations

- @Override
- @SuppressWarnings
- @Deprecated
- @SafeVarargs
- @FunctionalInterface 
- @Native

### @override 
- This annotation used to tell that this method inherited from its parent and declaration might differ from its parent class's method

### @SuppressWarnings
- This is used tell the compiler that "this class/method can create some warnings, please ignore those warnings".

### @Deprecated 
- This is used to tell the compiler that "This method/block going to use some old un intended methods. so ignore those warning/errors".   
 
### @SafeVarargs
- f

### @FunctionalInterface
- If we intend a Single Abstract Method interface to be used by lambdas, we can optionally mark it as such with @FunctionalInterface.

### @Native 
- As of Java 8, there is a new annotation in the java.lang.annotation package called Native. The @Native annotation is only applicable to fields. It indicates the annotated field is a constant that may be referenced from the native code. For instance, here's how it's used in the Integer class:

````java
public final class Integer {
@Native public static final int MIN_VALUE = 0x80000000;
// omitted
}
````
- This annotation can also serve as a hint for the tools to generate some auxiliary header files.

### @Target

we can specify which Java elements our custom annotation can be used to annotate. You do so by annotating your annotation definition with the @Target annotation

The ElementType class contains the following possible targets:

- ElementType.ANNOTATION_TYPE
- ElementType.CONSTRUCTOR
- ElementType.FIELD
- ElementType.LOCAL_VARIABLE
- ElementType.METHOD
- ElementType.PACKAGE
- ElementType.PARAMETER
- ElementType.TYPE
- ElementType.TYPE_PARAMETER
- ElementType.TYPE_USE

