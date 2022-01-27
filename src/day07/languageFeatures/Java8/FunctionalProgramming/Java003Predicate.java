package day07.languageFeatures.Java8.FunctionalProgramming;

import java.util.function.Predicate;

public class Java003Predicate {
    public static void main(String[] args) {
        System.out.println("Is given number is valid -> "+isStartsWith9.and(isContains10digits).test("909090909090"));
        System.out.println("Is given number is valid -> "+isStartsWith9.and(isContains10digits).test("909090"));
    }

    static Predicate<String> isStartsWith9  = number -> number.startsWith("9");
    static Predicate<String> isContains10digits  = number -> number.length()>=10;
}
