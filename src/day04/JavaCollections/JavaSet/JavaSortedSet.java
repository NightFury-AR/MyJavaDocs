package day04.JavaCollections.JavaSet;

import java.util.*;

class Car {
    private String carName;
    private String brand;
    private int modelNo;

    public Car(String brand,String carName,int modelNo){
        this.brand=brand;
        this.modelNo=modelNo;
        this.carName=carName;
    }

}

public class JavaSortedSet {
    public static void main(String[] args) {
        SortedSet newSortedSet = new TreeSet();

        newSortedSet.add("hello");
        newSortedSet.add("hai");
        newSortedSet.add("hi");
        newSortedSet.add("sawadeeka");
        System.out.println(newSortedSet);

        //comparator()
        System.out.println(newSortedSet.comparator());
        // subSet(Object fromElement, Object toElement)
        System.out.println(newSortedSet.subSet("hai","hi"));
        // headSet(Object toElement)
        System.out.println(newSortedSet.headSet("hi"));
        // tailSet(Object fromElement)
        System.out.println(newSortedSet.tailSet("hi"));
        // first()
        System.out.println(newSortedSet.first());
        // last()
        System.out.println(newSortedSet.last());

    }
}
