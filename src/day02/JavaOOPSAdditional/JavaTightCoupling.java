package day02.JavaOOPSAdditional;

// thanos is nothing without gauntlet. he and gauntlet tightly coupled
class Thanos {
    private Gauntlet weapon = new Gauntlet();
    public void usePowers() {
        System.out.println(" ha ha ha !!! 😈");
        weapon.useInfinityStonePowers();
    }
}

class Gauntlet {
    private String infinityStones;
    public void useInfinityStonePowers() {
        System.out.println(" snap...! half universe gone ! ");
    }
}



public class JavaTightCoupling {
    public static void main(String[] args) {
        Thanos alien = new Thanos();
        alien.usePowers();
    }
}
