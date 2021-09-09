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
    }
}
