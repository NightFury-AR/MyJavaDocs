package day02.JavaPolyMorphism;

class SuperMan{
    public void usePowers() {
        System.out.println("Super man power is used");
    }
}

class SuperWomen extends SuperMan {
    @Override
    public void usePowers() {
        System.out.println("Super Women power is used");
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        SuperMan sm = new SuperWomen();
        sm.usePowers();
    }
}
