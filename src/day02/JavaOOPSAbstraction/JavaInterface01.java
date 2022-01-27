package day02.JavaOOPSAbstraction;

interface Attack {
    public void fight(Attack p);
    public void kill();
}

class Players implements Attack {

    @Override
    public void fight(Attack opponent) {
        System.out.println("fighting started");
        opponent.kill();
    }

    @Override
    public void kill() {
        System.out.println("got killed...");
    }
}


public class JavaInterface01 {
    public static void main(String[] args) {
        Attack a = new Players();
        Players b = new Players();
        a.fight(b);
        b.fight(a);
        System.out.println((a instanceof Players));
        System.out.println((b instanceof Attack));

    }
}
