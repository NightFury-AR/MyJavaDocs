package day07.languageFeatures.Java8.Java8DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

public class JavaLocalDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("today            => "+today); // default yyyy-mm-dd
        System.out.println("\n========get methods========");
        System.out.println(" chronology            => "+today.getChronology());
        System.out.println(" Day of the Month      => "+today.getDayOfMonth());
        System.out.println("  Era                  => "+today.getEra());
        System.out.println(" Day of week           => "+today.getDayOfWeek());
        System.out.println(" Day of month          => "+ today.getDayOfMonth());
        System.out.println(" Month                 => "+today.getMonth());
        System.out.println(" Month Value           => "+today.getMonthValue());
        System.out.println(" Year                  => "+today.getYear());
        System.out.println(" get (long)            => to be implemented");
        System.out.println(" get (temporal         => to be implemented");

        System.out.println("\n========using with========");
        System.out.println(" with Month 2          => "+today.withMonth(2));
        System.out.println(" with year 2019        => "+today.withYear(2019));
        System.out.println(" Day of the month 1    => "+today.withDayOfMonth(1));
        System.out.println(" Day of the year 2     => "+today.withDayOfYear(2));
        System.out.println(" with(temporaladjuster => to be implemented");
        System.out.println(" with(temporal , long) => to be impl ");

        System.out.println("\n========minus=============");
        System.out.println(" minus(TemporalAmount)  => to be impl");
        System.out.println(" minus(long,tempunit)   => to be impl");
        System.out.println(" minus days - 3         => "+today.minusDays(3));
        System.out.println(" minus months -10       => "+today.minusMonths(10));
        System.out.println(" minus weeks - 10       => "+today.minusWeeks(10));
        System.out.println(" minus years - 2        => "+today.minusYears(2));

        System.out.println("\n========plus=============");
        System.out.println(" plus(TemporalAmount)  => to be impl");
        System.out.println(" plus(long,tempunit)   => to be impl");
        System.out.println(" plus days - 3         => "+today.plusDays(3));
        System.out.println(" plus months -10       => "+today.plusMonths(10));
        System.out.println(" plus weeks - 10       => "+today.plusWeeks(10));
        System.out.println(" plus years - 2        => "+today.plusYears(2));

        System.out.println("\n==========At============");
        System.out.println(" at start of the day                => "+today.atStartOfDay());
        System.out.println(" at start of the day with zone id   => "+today.atStartOfDay(ZoneId.systemDefault()));
        System.out.println(" setting with local time            => "+today.atTime(LocalTime.now()));
        System.out.println(" setting hr, min                    => "+today.atTime(12,30));
        System.out.println(" setting hr,min,sec                 => "+today.atTime(12,30,30));
        System.out.println(" setting hr,min,sec,nanosec         => "+today.atTime(12,30,30,20));
        System.out.println(" setting with offset                => "+today.atTime(OffsetTime.now()));

        
    }
}
