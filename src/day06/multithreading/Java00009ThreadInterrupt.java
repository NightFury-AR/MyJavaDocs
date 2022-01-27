package day06.multithreading;

class MyThreadNormal implements Runnable {
    @Override
    public void run() {
        try {
            String name = Thread.currentThread().getName();
            System.out.println(name+" : started...");
            for (int i=0;i<=4;i++) {
                System.out.println(name+": went to sleeping...");
                Thread.sleep(2000);
                System.out.println(name+": waked up");
                System.out.println(name+"having fun..,");
            }
        }
        catch (Exception e) {
            System.out.println(Thread.currentThread().getName()+": can't sleep well. interrupted and died.");
        }
    }
}

public class Java00009ThreadInterrupt {
    public static void main(String[] args) {
        try {
            Thread t = new Thread(new MyThreadNormal(),"SingleBoy");
            Thread t2 = new Thread(new MyThreadNormal(), "Committed Boy");
            t.start();
            t2.start();
            t2.interrupt();
        } catch (Exception e) {
            System.out.println("interrupted");
        }
    }
}
