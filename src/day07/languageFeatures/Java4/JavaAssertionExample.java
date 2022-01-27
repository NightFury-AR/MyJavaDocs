package day07.languageFeatures.Java4;

import java.util.Scanner;

public class JavaAssertionExample {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner( System.in );
        System.out.print("Enter ur age ");

        int value = scanner.nextInt();
        assert value>=18:" Not valid"; //works when we enabled assertions
        System.out.println("value is "+value);

    }
}
