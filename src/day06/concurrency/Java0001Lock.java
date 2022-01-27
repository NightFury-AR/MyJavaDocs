package day06.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Java0001Lock {
    private Lock lock = new ReentrantLock(); /* Only after using the release can other threads acquire locks*/

    public void lockTest(Thread thread) {

        lock.lock(); // Acquire locks
        try {
            System.out.println(thread.getName() +"get the current lock"); //print the name of the current lock
            Thread.sleep(2000); // To see the effect of execution, the thread hibernates here for 2 seconds
        } catch (Exception e) {
            System.out.println(thread.getName()+ "abnormal release lock occurred");
        }finally {
            System.out.println(thread.getName()+ "Executing the completed release lock");
            lock.unlock(); // unlock
        }
    }

    public static void main(String[] args) {

        Java0001Lock lockTest = new Java0001Lock();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lockTest.lockTest(Thread.currentThread());
            }
        }, "Thread-01 ");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                lockTest.lockTest(Thread.currentThread());
            }
        }, "Thread-02 ");


        thread2.start();
        thread1.start();

    }
}
