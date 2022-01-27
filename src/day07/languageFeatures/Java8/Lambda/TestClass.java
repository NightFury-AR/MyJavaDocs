package day07.languageFeatures.Java8.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {

    public static void main(String[] args) {
        List<String> f = new ArrayList<>();
        f.addAll(Arrays.asList("apple","Orange","grape","mango","banana","grape"));
        if(f.remove("grape")){
            f.remove("apple");
        }
        System.out.println(Arrays.toString(f.toArray()));
    }
}
