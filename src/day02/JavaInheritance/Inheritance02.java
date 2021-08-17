package day02.JavaInheritance;

//multilevel inheritance

class Parent {
    public void display() {
        System.out.println("I'm parent");
    }
}

class child01 extends Parent {
    public void display() {
        System.out.println("I'm child01");
    }
}

class child02 extends Parent {
    public void display() {
        System.out.println("I'm child02");
    }
}



public class Inheritance02 {
    public static void main(String[] args) {
        Parent p = new child01();
        Parent p1 = new child02();

        p.display();
        p1.display();
    }
}
