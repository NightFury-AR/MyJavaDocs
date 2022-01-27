package day07.languageFeatures.Java8.Java8DateTime;

import java.time.Clock;
import java.time.LocalDateTime;

public class JavaLocalDateAndTime {
    public static void main(String[] args) {
        Clock c = Clock.systemUTC();
        LocalDateTime dt = LocalDateTime.now(c);
        System.out.println(dt);
        System.out.println(LocalDateTime.now());
        // LocalDate + LocalTime
    }
}
