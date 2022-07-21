package day07.languageFeatures.Java8.FunctionalProgramming.Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FP001Distinct {

    public static void main(String[] args) {

        //distinct
        List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
        List<Integer> distinct = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(" Distinct List => "+distinct);
        //alternative using set to remove duplicate
        System.out.println(" Distinct List using Set => "+ numbers.stream().collect(Collectors.toSet()));

    }
}
