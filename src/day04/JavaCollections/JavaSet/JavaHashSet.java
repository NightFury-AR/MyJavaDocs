package day04.JavaCollections.JavaSet;

import java.util.*;

public class JavaHashSet {
    public static void main(String[] args) {
        //creation
        Set<Integer> newHSet = new HashSet<>();
        newHSet.addAll(Arrays.asList(new Integer[]{12,12,12,14,15,16}));
        //size
        System.out.println(newHSet.size());
        //but duplication removed
        System.out.println(newHSet);
    }
}
