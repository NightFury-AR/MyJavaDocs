package day07.languageFeatures.Java8.FunctionalProgramming.Advanced;

import java.util.Random;
import java.util.stream.IntStream;

public class FP004IntStream {

    public static void main(String[] args) {
        //1.range exclusive
        IntStream.range(0,10).forEach(System.out::print);
        System.out.println();

        //2.range inclusive
        IntStream.rangeClosed(0,10).forEach(System.out::print);
        System.out.println();

        //3.range iterate
        IntStream.iterate(0, value -> value + 1)
                .limit(11)
                .forEach(System.out::print);
        System.out.println();

        //## interview question
        //print 10 random numbers

        //using range
        IntStream.rangeClosed(1,10)
                .mapToObj( num -> (int) Math.random() + num * num  )
                .forEach(System.out::print);
        System.out.println();

        // using iterate
        IntStream.iterate(1,value -> value + 1)
                .limit(10)
                .forEach(System.out::print);

    }

}
