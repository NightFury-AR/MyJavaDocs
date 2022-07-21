package day04.JavaCollections.JavaCollectionsInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSMethods {

    public static void main(String[] args) {
           List<String> list = new ArrayList<>();
           String[] d = {"hi","hello","how are you"};
           Collections.addAll(list,d);
           System.out.println(list);
           Collections.sort(list);
           System.out.println(list);
           Collections.sort(list,Collections.reverseOrder());
           //Collections.synchronizedList();
           //Collections.emptyList()
           //Collections.
            List<Integer> numList = new ArrayList<>();
            numList.add(1);
            numList.add(2);
            numList.add(3);
            numList.add(4);
            numList.add(5);
            numList.add(6);
            numList.add(4);
            numList.add(5);
            numList.add(6);
            System.out.println(Collections.singleton(4));

    }
}
