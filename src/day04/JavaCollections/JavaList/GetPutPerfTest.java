package day04.JavaCollections.JavaList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GetPutPerfTest {
    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();
        List<Integer> linkedlist = new LinkedList<>();

        System.out.println("1.Adding operation ");
        // arraylist add
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arraylist.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("arraylist add:  " + duration);

        // linkedlist add
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedlist.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("linkedlist add: " + duration);

        System.out.println("2.get operation ");
        // arraylist get
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arraylist.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("arraylist get:  " + duration);

        // linkedlist get
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedlist.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("linkedlist get: " + duration);

        // arraylist remove
        System.out.println("Remove operations");
        startTime = System.nanoTime();
        for (int i = 9999; i >=0; i--) {
            arraylist.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("arraylist remove:  " + duration);

        // linkedlist remove
        startTime = System.nanoTime();
        for (int i = 9999; i >=0; i--) {
            linkedlist.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("linkedlist remove: " + duration);
    }
}
