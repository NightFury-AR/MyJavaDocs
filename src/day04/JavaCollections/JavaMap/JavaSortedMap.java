package day04.JavaCollections.JavaMap;

import java.util.*;

public class JavaSortedMap {
    public static void main(String[] args) {
        SortedMap<Integer,String> sMap = new TreeMap<>();
        sMap.put(1,"hi");
        sMap.put(2,"hello");
        sMap.put(3,"how");
        sMap.put(4,"yow");
        sMap.put(5,"kyun");

        //comparator()
        System.out.println(sMap.comparator());

        // SortedMap<Integer, String> subMap(Integer fromKey, Integer toKey)
        System.out.println(sMap.subMap(1,3));

        // SortedMap<Integer, String> headMap(Integer toKey)
        System.out.println(sMap.headMap(3));

        // SortedMap<Integer, String> tailMap(Integer fromKey)
        System.out.println(sMap.tailMap(2));

        // Integer firstKey()
        System.out.println(sMap.firstKey());

        // lastKey()
        System.out.println(sMap.lastKey());
    }
}
