package day07.languageFeatures.Java8.Java8DateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class JavaLocalTime {
    public static void main(String[] args) {
        LocalTime l = LocalTime.now();

        System.out.println("Local Time             => "+LocalTime.now());
        System.out.println("Local Time Parser      => "+LocalTime.parse("12:30:20"));
        System.out.println(l.atDate(LocalDate.parse("2021-12-18")));
    }
}
