package day04.JavaCollections.JavaSet;

import java.util.*;

public class JavaNavigableSet {
    public static void main(String[] args) {
        NavigableSet<Integer> nv = new TreeSet<>();
        nv.add(12);
        nv.add(1);
        nv.add(-1);
        nv.add(3);
        nv.add(5);
        System.out.println(nv);

        //lower(Object o)
        //return lower than passed element (passedelemt - 1)
        System.out.println("Lower : "+nv.lower(5));

        //higher(Object o)
        System.out.println("Higher : "+nv.higher(3));

        //floor(Object o)
        System.out.println("Floor : "+nv.floor(5));

        //ceiling(Object o)
        System.out.println("Ceil : "+nv.ceiling(5));

        //pollFirst()
        System.out.println("pollFirst : "+nv.pollFirst());
        System.out.println(nv);

        //pollLast()
        System.out.println("pollLast : "+nv.pollLast());
        System.out.println(nv);

        //descendingSet()
        System.out.println("descending "+nv.descendingSet());

        //descendingIterator()
        System.out.println("descending iterator "+nv.descendingIterator().next());
        nv.add(14);
        nv.add(4);
        nv.add(2);
        nv.add(1);
        //subSet(Object fromElement, Object toElement)
        System.out.println(nv);
        System.out.println("subset 1-5 => "+nv.subSet(1,5));

        //subSet(Object fromElement, boolean fromInclusive, Object toElement, boolean toInclusive)
        System.out.println("subset 1-5 (both exclusive "+nv.subSet(1,false,5,false));

        //headSet(Object toElement, boolean inclusive)
        System.out.println("head set(to) =>  "+nv.headSet(4));

        //headSet(Object toElement)
        System.out.println("head set(to + to inclusive) => "+nv.headSet(5,true));

        //NavigableSet tailSet(Object fromElement, boolean inclusive)
        System.out.println("tailSet(from,inclusive?) => "+nv.tailSet(2,true));

        //tailSet(Object fromElement)
        System.out.println("tailSet(from) => "+nv.tailSet(2));

        //comparator()
        System.out.println(" comparator "+nv.comparator());

        //first()
        System.out.println("first => "+nv.first());

        //last()
        System.out.println("last => "+nv.last());
    }
}
