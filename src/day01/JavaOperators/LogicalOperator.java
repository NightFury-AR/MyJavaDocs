package day01.JavaOperators;

public class LogicalOperator {
    public static int a,b;

    public static void main(String[] args) {
    a=2;b=5;
    System.out.println("1.Logical AND (both sides should be boolean (true,false)");
    System.out.println(true&&false); // 0 && 1 will not work here
    System.out.println("2.Logical OR ");
    System.out.println(true||false); // 0 || 1 will not work here
    System.out.println("3.Logical NOT ");
    System.out.println(!true); // only boolean will work.
    }
}
