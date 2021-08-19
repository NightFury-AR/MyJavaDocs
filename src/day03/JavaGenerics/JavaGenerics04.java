package day03.JavaGenerics;

//upper bound type
class GenericUpperBound<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void acceptNumberType(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

}

public class JavaGenerics04 {
    public static void main(String[] args) {
        GenericUpperBound<Integer> integerBox = new GenericUpperBound<Integer>();
        integerBox.set(new Integer(10));
        integerBox.acceptNumberType(10.0f);
        //integerBox.acceptNumberType("hai"); // error: this is still String!
    }
}
