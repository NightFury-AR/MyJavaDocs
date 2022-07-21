package day09.d01_creational_pattern.dp01_factory_pattern.example01.factory_products;

import day09.d01_creational_pattern.dp01_factory_pattern.example01.factory_products.products.MySQLDB;
import day09.d01_creational_pattern.dp01_factory_pattern.example01.factory_products.products.OracleDB;
import day09.d01_creational_pattern.dp01_factory_pattern.example01.factory_products.types.DB;
import day09.d01_creational_pattern.dp01_factory_pattern.example01.factory_products.types.DBProviders;

public class DBFactory {

    public static DB getInstance(DBProviders dbProviders) {
        if(dbProviders.equals(DBProviders.ORACLE_DB)) return new OracleDB("user","pass","oracle:url");
        else if(dbProviders.equals(DBProviders.MYSQL_DB)) return new MySQLDB("user","pass","mysql:url");
        else if(dbProviders.equals(DBProviders.POSTGRESQL_DB)) return new MySQLDB("user","pass","postgresql:url");
        else return null;
    }

    public static DB getInstance() {
        return new OracleDB("user","pass","localhost");
    }
}
