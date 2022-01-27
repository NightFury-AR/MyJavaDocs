package day06.multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class ProducerThread implements Runnable {

    public final List<String> taskQueue;
    public final int MAX_DEPTH;

    public ProducerThread(List<String> l,int depth) {
        this.taskQueue=l;
        this.MAX_DEPTH=depth;
    }

    @Override
    public void run() {
        while (true){
            try {
                produceMessage();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void produceMessage() throws InterruptedException{
        synchronized (taskQueue) {
            // if queue reached is maximum depth the we will wait for consumer to pickup
            if (taskQueue.size()==MAX_DEPTH || (taskQueue.size()>MAX_DEPTH)){
                System.out.println("Queue depth is full, waiting for read...");
                taskQueue.notifyAll();//now we will notify if only queue is full
                taskQueue.wait();
            } else {
                System.out.print("Enter messages to add :");
                Scanner sc = new Scanner(System.in);
                String msg = sc.nextLine();
                taskQueue.add(msg);
                System.out.println("Produced message is "+msg);
                sc=null;msg=null;
                //taskQueue.notifyAll();//once added will tell consumer
                //taskQueue.wait();// and wait for consumer to pickup
            }

        }
    }
}

class ConsumerThread implements Runnable {

    public final List<String> taskQueue;
    public final int MAX_DEPTH;

    public ConsumerThread(List<String> l,int depth) {
        this.taskQueue=l;
        this.MAX_DEPTH=depth;
    }

    @Override
    public void run() {
        while (true)
        {
            try
            {
                consume();
            } catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }
        }
    }
    public void consume() throws InterruptedException {
        synchronized (taskQueue)
        {
            while (taskQueue.isEmpty())
            {
                System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting , size: " + taskQueue.size());
                taskQueue.wait();
            }
            //int i = (Integer) taskQueue.remove(0);
            String s = taskQueue.remove(0);
            System.out.println("Consumed: " + s);
            //Thread.sleep(10000);
            taskQueue.notifyAll();
        }
    }

}

public class Java00013ProducerConsumer {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Collections.synchronizedList(list);
        int MAX_DEPTH = 5;
        Thread producer = new Thread(new ProducerThread(list,MAX_DEPTH));
        Thread consumer = new Thread(new ConsumerThread(list,MAX_DEPTH));
        producer.start();
        consumer.start();


    }
}