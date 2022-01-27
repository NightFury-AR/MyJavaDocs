package day07.languageFeatures.Java5;

public class JavaAutoBoxingUnBoxing {
    public static void main(String[] args) {
        //AutoBoxing
        int primitiveInt = 100;
        Integer nonPrimitiveInt = primitiveInt; // here its automatically converts non-primitive to primitive without casting
        //UnBoxing
        Integer nonPrimitiveInt01 = 2222;
        int primitiveInt01 = nonPrimitiveInt01;// primitive <> non primitive
    }
}
