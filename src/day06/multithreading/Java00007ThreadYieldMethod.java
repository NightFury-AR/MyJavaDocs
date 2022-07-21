package day06.multithreading;


class MyRunnableWithYield implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" started execution");
        try {
            System.out.println(name+": its not urgent. you can take scheduler to execute yours");
            Thread.yield();
            //when we use yield it gives the scheduler to another thread.
            // like "for me its not urgent , you can take the scheduler , i'll take a quick nap"
            for (int i=0;i<10;i++) {
                Thread.sleep(1000);
                System.out.println(name+": scheduler is free, so i'll execute my tasks");
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
        t.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(5);
        t.start();
        t2.start();
    }



}
