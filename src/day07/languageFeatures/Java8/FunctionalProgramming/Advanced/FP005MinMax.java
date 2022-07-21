package day07.languageFeatures.Java8.FunctionalProgramming.Advanced;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FP005MinMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,9,87,34,9,256,90,6670,045);

        //1.min
        numbers.stream().min(Comparator.naturalOrder()).ifPresent(System.out::println);

        //2.max
        numbers.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
    }
}
