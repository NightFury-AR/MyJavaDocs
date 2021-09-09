package day04.JavaCollections.JavaSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//aka SortedSet
public class JavaTreeSet {
    public static void main(String[] args) {
        //creation
        Set<Integer> newTreeSet = new TreeSet<>();
        newTreeSet.addAll(Arrays.asList(new Integer[]{12,12,12,14,15,16,0,-2,3}));
        //size
        System.out.println(newTreeSet.size());
        System.out.println(newTreeSet);
    }
}
