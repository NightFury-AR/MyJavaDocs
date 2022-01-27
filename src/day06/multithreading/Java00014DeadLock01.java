package day06.multithreading;

class PlayerA {
    public synchronized void fight(PlayerB opponent){
        opponent.kill();
    }
    public void kill() {
        System.out.println(Thread.currentThread().getName()+": got killed");
    }
}

class PlayerB{
    public synchronized void fight(PlayerA opponent){
        opponent.kill();
    }
    public synchronized void kill() {
        System.out.println(Thread.currentThread().getName()+": got killed");
    }
}

class MyDeadLockThread01 implements Runnable {
    private PlayerA player;
    private PlayerB opponent;
    public MyDeadLockThread01(PlayerA player,PlayerB opponent){
        this.player=player;
        this.opponent=opponent;
    }
    @Override
    public void run() {
        try{
            Thread.sleep(2000);
            player.fight(opponent);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

class MyDeadLockThread02 implements Runnable {
    private PlayerB player;
    private PlayerA opponent;
    public MyDeadLockThread02(PlayerB player,PlayerA opponent){
        this.player=player;
        this.opponent=opponent;
    }
    @Override
    public void run() {
        try{
            Thread.sleep(2000);
            player.fight(opponent);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

public class Java00014DeadLock01 {
    public static void main(String[] args) throws InterruptedException {
        PlayerA playerA = new PlayerA();
        PlayerB playerB = new PlayerB();
        Thread fightA = new Thread(new MyDeadLockThread01(playerA,playerB)); //player A is our player,player B is our opponent
        Thread fightB = new Thread(new MyDeadLockThread02(playerB,playerA)); //player B is our player,player A is our opponent

        //lets fight
        fightA.start();
        fightB.start();
        Thread.sleep(2000);
        System.out.println("Fight not yet end ....");

    }
}
