package day07.languageFeatures.Java8.FunctionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Java001FunctionAndBiFunction {
    public static void main(String[] args) {

        //Functions<T,R>

        //normal approach
        System.out.println("Normal - increment by one          : "+incrementByOne(1));
        System.out.println("Normal - multiply  by ten          : "+multiplyBy10(1));

        //Functional approach
        System.out.println("Functional - increment by one      : "+incrementByOneFunc.apply(1));
        System.out.println("Functional - multiply  by ten      : "+multiplyBy10Func.apply(10));
        Function<Integer,Integer> incrementByOneAndMultiplyBy10 = incrementByOneFunc.andThen(multiplyBy10Func);
        System.out.println("Functional - (+ and *)2 functions  : "+incrementByOneAndMultiplyBy10.apply(1));

        //BiFunctions -- takes 2 arguments and return 1 results
        System.out.println("Bi Functions                       : "+incrementANDMultiply.apply(4,100));
    }



    public static int incrementByOne (int a) {
        return a+1;
    }

    public static int multiplyBy10 (int a) {
        return a*10;
    }

    public static Function<Integer,Integer> incrementByOneFunc = number -> number+1;
    public static Function<Integer,Integer> multiplyBy10Func = number -> number*10;

    static BiFunction<Integer,Integer,Integer> incrementANDMultiply = (numberToIncrement,numberToMultiply)
            -> (numberToIncrement+1)*numberToMultiply;

}
