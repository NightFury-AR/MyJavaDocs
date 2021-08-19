package day03.JavaGenerics;

//generic methods

class GenericMethods<K,V>{
    private K model;
    private V color;

    public GenericMethods(K k,V v) {
        this.color=v;
        this.model=k;
    }

    public <K,V> void changeOrder(K newKey,V newValue) {
        System.out.println("order changed : "+newKey+" "+newValue);
    }
}
public class JavaGenerics03 {
    public static void main(String[] args) {
        GenericMethods<Integer,String> v = new GenericMethods<>(1001,"black");
        //different param <int,int>
        v.<Integer,Integer>changeOrder(10002,22222);
        //different param<string,int>
        v.<String,Integer>changeOrder("Hello",12);
        //different param <string,string>
        v.<String,String>changeOrder("hi","hello");
    }
}
