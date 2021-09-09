package day04.JavaCollections.JavaQueue;

import java.util.*;

public class JavaQueue {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("hai 1");
        myQueue.add("hello 2");
        myQueue.add("hai 3");
        myQueue.add("hello 4");
        //only additional methods from list methods provided

        //offer(String s)
        System.out.println(myQueue.offer("yup !"));
        System.out.println(myQueue);
        //poll()
        System.out.println("polling : "+myQueue.poll());
        System.out.println(myQueue);
        //element()
        System.out.println("element : "+myQueue.element());
        System.out.println(myQueue);
        //peek()
        System.out.println("peek : "+myQueue.peek());
        System.out.println(myQueue);//oooh maname oooh maname unnaal
        Deque<String> deQ = new ArrayDeque<>();



    }
}
