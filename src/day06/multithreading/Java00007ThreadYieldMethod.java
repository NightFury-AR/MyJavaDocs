package day06.multithreading;

class MyRunnableWithYield implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" started execution");
        try {
            Thread.yield();
            System.out.println(name+": I'm going to sleep for 3 sec");
            for (int i=0;i<10;i++) {
                Thread.sleep(3000);
                System.out.println(name+": i woke up");

            }

        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

class MyRunnableNormal implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            System.out.println("Heheheheheheheh");
        }
    }
}

public class Java00007ThreadYieldMethod {

    public static void main(String[] args) {
        Thread.currentThread().setName("CENOINTHEHOUSE");
        Thread t = new Thread(new MyRunnableWithYield());
        Thread t2 = new Thread(new MyRunnableNormal());
        t.start();
        t2.start();
    }



}
