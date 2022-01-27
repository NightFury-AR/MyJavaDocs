package day06.multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnableThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" : started");
        processMessage();
        System.out.println(Thread.currentThread().getName()+" : completed");

    }
    public void processMessage() {
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


public class JavaSingleThreadPool {
    public static void main(String[] args) {
        ExecutorService eS = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            Runnable worker = new MyRunnableThread();
            eS.execute(worker);//calling execute method of ExecutorService
        }
        eS.shutdown();
    }
}
