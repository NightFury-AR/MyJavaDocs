package day04.JavaCollections.JavaCollectionsInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class CollectionFrequency {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("A");
        s.add("B");
        s.add("B");
        s.add("D");
        s.add("F");
        System.out.println(Collections.frequency(s,"B"));
        //
        String a = "AVENGER";
        List<String> strings = Arrays.asList(a.split(""));
        System.out.println(strings);
    }
}
