package day07.languageFeatures.Java5;

//when we use method overriding in java , we use same return type for both parent class and subclass.
//but we can use different return type using this covariant concept.
//e.g, parentClassMethod returns Number, then child class can return either Number or (Integer,Float,Double).
// why because Integer is Number type (click ctrl+click above the Integer type, it will extends Number)

abstract class StructureClass {
    public abstract Number getLimits();
}

class ImplClass extends StructureClass {

    @Override
    public Integer getLimits() { // here you can see this accepts return type as integer instead of Number
        int i = 100;
        return i;
    }
}

public class JavaCoVariantReturnType {
    public static void main(String[] args) {
        StructureClass s = new ImplClass();
        System.out.println(s.getLimits());
    }
}
