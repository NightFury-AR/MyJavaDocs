package day07.languageFeatures.Java8.FunctionalProgramming;

import java.sql.Connection;
import java.util.function.Supplier;

public class Java004Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnection.get());
    }
    static Supplier<Connection> getDBConnection= () -> {
        Connection con=null;
        System.out.println("Fetching connection");
        return con;
    };
}
