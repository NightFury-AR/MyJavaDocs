package day02.JavaOOPSAdditional;

// time stone can be used by anyone if you how to use it. but gauntlet only can used by thanos

interface PowerStone {
    void usePowerStone();
}

interface TimeStone {
    void useTimeStone();
}

interface SoulStone {
    void useSoulStone();
}

class GuardianOfTheGalaxy implements PowerStone {
    public void usePowerStone() {
        System.out.println("Using Power stone to attack the enemy !");
    }
}

class DrStrange implements TimeStone {
    @Override
    public void useTimeStone() {
        System.out.println("use time stone to control time ");
    }
}

class Vision implements SoulStone {
    @Override
    public void useSoulStone() {
        System.out.println("use soul stone to capture the souls");
    }
}

class Thanos01 implements TimeStone,SoulStone{
    @Override
    public void useTimeStone() {
        System.out.println("Thanos using time stone to destroy everything");
    }
    @Override
    public void useSoulStone() {
        System.out.println("Thanos using soul stone to destroy everything");
    }
}


public class JavaLooseCoupling {
    public static void main(String[] args) {
        GuardianOfTheGalaxy avenger01 = new GuardianOfTheGalaxy();
        DrStrange avenger02 = new DrStrange();
        Vision avenger03 = new Vision();
        Thanos01 alien = new Thanos01();

        avenger01.usePowerStone();
        avenger02.useTimeStone();
        avenger03.useSoulStone();
        alien.useTimeStone();
        alien.useSoulStone();
    }
}
