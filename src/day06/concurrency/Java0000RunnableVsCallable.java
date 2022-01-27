package day06.concurrency;

import java.util.concurrent.*;

public class Java0000RunnableVsCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(" Runnable vs Callable ");

        Thread runnable = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" is Running with Runnable ");
                System.out.println(Thread.currentThread().getName()+" I'll not return any values, my Job is to just execute...");
            }
        });

        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(runnable);
        Future<Integer> f = es.submit(new Callable<Integer>(){
            @Override
            public Integer call() throws Exception {
                System.out.println(Thread.currentThread().getName()+" is using callable");
                System.out.println(Thread.currentThread().getName()+" I will always return some values, you get it using future object..");
                return 7;
            }
        });
        System.out.println(" Future Methods ");
        System.out.println("Is Done ? "+f.isDone());
        System.out.println("Is cancelled ? "+f.isCancelled());
        System.out.println("Cancelling the task "+f.cancel(true));
        System.out.println(f.isCancelled() ? "ouch, Its cancelled, so i can't give you the return value " :"Returned "+f.get().intValue());
        es.shutdown();
        while (!es.isShutdown()){}
        System.out.println("Helooooooooo, its done");

    }
}
