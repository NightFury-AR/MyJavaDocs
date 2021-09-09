package day04.JavaCollections.JavaQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class JavaDeQueue {
    public static void main(String[] args) {
        Deque<String> dQ = new ArrayDeque<>();
        dQ.offerFirst("hello");
        dQ.offer("Man");
        System.out.println(dQ);
        dQ.offerFirst("hi");
        System.out.println(dQ);
        System.out.println(dQ.peekLast());
        dQ.pollLast();
        System.out.println(dQ);
    }
}
