package day06.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class java0002TryLock {
    ReentrantLock lock = new ReentrantLock();

    public void LockTest() {
        if(!lock.isLocked()) {
            if (lock.tryLock()) {
                try {
                    System.out.println(Thread.currentThread().getName() + " gotcha, got the lock");
                    System.out.println(Thread.currentThread().getName() + " Going for sleeping ");
                    Thread.sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " lost the lock man ");
            }
        } else {
            System.out.println(Thread.currentThread().getName()+" lock acquired by some other guy");
        }
    }

    public static void main(String[] args) {
        java0002TryLock tryLockTest = new java0002TryLock();
        //t1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                tryLockTest.LockTest();
            }
        }," Thread-001 ");
        //t2
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                tryLockTest.LockTest();
            }
        }," Thread--02 ");

        t1.start();
        t2.start();

    }
}
