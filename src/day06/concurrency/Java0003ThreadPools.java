package day06.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Java0003ThreadPools {
    public void running() {
        System.out.println("Thread : "+Thread.currentThread().getName()+" is running ");
    }

    public static void main(String[] args) {
        Java0003ThreadPools j = new Java0003ThreadPools();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                j.running();
            }
        },"Thread A : ");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                j.running();
            }
        },"Thread B : ");

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                j.running();
            }
        },"Thread C: ");

        ExecutorService es = Executors.newFixedThreadPool(3);

        for (int i=0;i<=5;i++){
            es.execute(t1);
            es.execute(t2);
            es.execute(t3);
        }
        es.shutdown();
        System.out.println(es.isTerminated());
        while (!es.isTerminated()){}
        if(es.isTerminated()){
            System.out.println("All are terminated now ...");
        }


    }
}
