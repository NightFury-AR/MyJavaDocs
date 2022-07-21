package day09.d01_creational_pattern.dp01_factory_pattern.example01;

import day09.d01_creational_pattern.dp01_factory_pattern.example01.factory_products.DBFactory;
import day09.d01_creational_pattern.dp01_factory_pattern.example01.factory_products.types.DB;
import day09.d01_creational_pattern.dp01_factory_pattern.example01.factory_products.types.DBProviders;

public class MainClass {
    public static void main(String[] args) {
        // by default its oracle
        DB instance = DBFactory.getInstance();
        instance.connect();

        // using my sql
        DB instance1 = DBFactory.getInstance(DBProviders.MYSQL_DB);
        instance1.connect();

    }
}
