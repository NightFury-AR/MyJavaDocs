package day02.JavaInheritance;

class A {
    public A() {
        System.out.println("i'm used by B😑");
    }
   public void display() {
        System.out.println("class A");
    }
}

class B extends A{
    public void display() {
        System.out.println("class B");
    }
}
public class Inheritance01 {
    public static void main(String[] args) {
        A a = new B();
        a.display();
    }
}
