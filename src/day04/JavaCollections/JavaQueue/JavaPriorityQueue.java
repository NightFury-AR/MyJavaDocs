package day04.JavaCollections.JavaQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class JavaPriorityQueue {

    public static void main(String[] args) {
        Queue<String> pQ = new PriorityQueue();
        pQ.offer("d");
        pQ.offer("a");
        pQ.offer("f");
        System.out.println(pQ);
        pQ.poll();
        System.out.println(pQ.peek());
        Queue<Integer> pQ1 = new PriorityQueue();
        pQ1.offer(12);
        pQ1.offer(23);
        pQ1.offer(10);
        pQ1.offer(2);
        pQ1.offer(0);
        pQ1.offer(21);
        pQ1.offer(-2);
        pQ1.offer(4);
        //System.out.println(pQ1.poll());
        System.out.println(pQ1);
    }


}
