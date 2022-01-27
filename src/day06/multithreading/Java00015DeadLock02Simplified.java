package day06.multithreading;

//apart from prev example , we used only one class (OOPS takes its place :) )

interface Human {
    public void usePower(Hero p);
    public void kill();
}

//only one class
class Hero implements Human {
    private String playerName;

    public Hero(String playerName){
        this.playerName=playerName;
    }

    @Override
    public synchronized void usePower(Hero opponent) {
        System.out.println(playerName+" fighting...");
        opponent.kill();
    }

    @Override
    public synchronized void kill() {
        System.out.println(" oh my 😑 "+playerName+" got killed");
    }
}

class Fight implements Runnable {

    private Hero player;
    private Hero opponent;

    public Fight(Hero p,Hero o) {
        this.opponent=o;
        this.player=p;
    }

    @Override
    public void run() {
        player.usePower(opponent);
    }
}

public class Java00015DeadLock02Simplified {
    public static void main(String[] args) throws InterruptedException{
        Hero Tony = new Hero("IRONMAN");
        Hero Roger = new Hero("CAPTAIN AMERICA");

        Thread CapAttack = new Thread(new Fight(Roger,Tony));
        Thread TonyAttack = new Thread(new Fight(Tony,Roger));

        CapAttack.start();
        TonyAttack.start();

        Thread.sleep(3000);
        System.out.println(" I already know that no one will win   , both will keep fighting .... 😎");
    }
}
