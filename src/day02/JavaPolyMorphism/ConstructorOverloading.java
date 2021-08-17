package day02.JavaPolyMorphism;

//same constructors with different parameter
class SuperHero{
    public SuperHero() {
        System.out.println("Unknown Super Hero Discovered");
    }
    public SuperHero(String name) {
        System.out.println(name+" Discovered");
    }
}


public class ConstructorOverloading {
    public static void main(String args[]) {
        SuperHero x = new SuperHero();
        SuperHero superman = new SuperHero("Super Man");
    }
}
