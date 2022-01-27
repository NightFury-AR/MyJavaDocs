package day06.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyFixedThread implements Runnable {
    private String name;
    public MyFixedThread(String name) {
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"::"+name+" : Started");
        processSleeping();
        System.out.println(Thread.currentThread().getName()+"::"+name+" : completed");
    }
    public void processSleeping() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class JavaFixedThreadPool {
    public static void main(String[] args) {
        ExecutorService  es = Executors.newFixedThreadPool(2);
        for (int i=0;i<12;i++) {
            Runnable workers = new MyFixedThread(" E"+i);
            es.execute(workers);
        }
        es.shutdown();
        System.out.println(es.isTerminated());
        while (!es.isTerminated()) {
            System.out.println("hel");
        }
        if(es.isTerminated()) {
            System.out.println("All workers are terminated");
        }
    }
}
