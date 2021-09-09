package day04.JavaCollections.JavaMap;

import java.util.*;

public class JavaNavigableMap {
    public static void main(String[] args) {
        NavigableMap<Integer,String> nMap = new TreeMap<>();
        nMap.put(1,"CONQUEROR");
        nMap.put(2,"ACE");
        nMap.put(3,"CROWN");
        nMap.put(4,"Diamond");
        nMap.put(5,"platinum");
        nMap.put(6,"gold");
        //Entry<Integer, String> lowerEntry(Integer key)
        System.out.println(" lower entry "+nMap.lowerEntry(4));
        System.out.println(" lower entry "+nMap.lowerEntry(2));

        // Integer lowerKey(Integer key)
        System.out.println(" lower key "+nMap.lowerKey(3));

        // Entry<Integer, String> floorEntry(Integer key)
        System.out.println(" floor entry "+nMap.floorEntry(5));

        // Integer floorKey(Integer key)
        System.out.println(" floor key "+nMap.floorKey(4));

        // ceilingEntry(Integer key)
        System.out.println(" ceiling entry "+nMap.ceilingEntry(5));

        // Integer ceilingKey(Integer key)
        System.out.println(" ceil key "+nMap.ceilingKey(2));

        // Entry<Integer, String> higherEntry(Integer key)
        System.out.println(" higher entry "+nMap.higherEntry(5));

        // Integer higherKey(Integer key)
        System.out.println(" high key "+nMap.higherKey(3));

        // Entry<Integer, String> firstEntry()
        System.out.println(" first entry "+nMap.firstKey());

        // Entry<Integer, String> lastEntry()
        System.out.println(" last entry "+nMap.lastEntry());

        // Entry<Integer, String> pollFirstEntry()
        System.out.println(" poll first entry "+nMap.pollFirstEntry());

        // Entry<Integer, String> pollLastEntry()
        System.out.println(" poll last entry "+nMap.pollLastEntry());

        // NavigableMap<Integer, String> descendingMap()
        System.out.println(" descending map "+nMap.descendingMap());

        // NavigableSet<Integer> navigableKeySet()
        System.out.println(" nav key set "+nMap.navigableKeySet());

        // NavigableSet<Integer> descendingKeySet()
        System.out.println(" desc key set "+nMap.descendingKeySet());

        // NavigableMap<Integer, String> subMap(Integer fromKey, boolean fromInclusive, Integer toKey, boolean toInclusive)
        System.out.println(nMap.subMap(1,true,4,true));

        // NavigableMap<Integer, String> headMap(Integer toKey, boolean inclusive)
        System.out.println("head map "+nMap.headMap(4,true));

        // NavigableMap<Integer, String> tailMap(Integer fromKey, boolean inclusive)
        System.out.println(" tail map "+nMap.tailMap(5,true));

        // SortedMap<Integer, String> subMap(Integer fromKey, Integer toKey)
        System.out.println("sub map "+nMap.subMap(1,4));

        // SortedMap<Integer, String> headMap(Integer toKey)
        System.out.println(" headMp "+nMap.headMap(3));

        // SortedMap<Integer, String> tailMap(Integer fromKey)
        System.out.println(" tail map "+nMap.tailMap((3)));

        // Comparator<? super Integer> comparator()

    }
}
