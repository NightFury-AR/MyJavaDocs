package day09.d01_creational_pattern.dp01_factory_pattern.example01.factory_products.products;

import day09.d01_creational_pattern.dp01_factory_pattern.example01.factory_products.types.DB;

public class OracleDB extends DB {

    private boolean isAlive;

    public OracleDB(String userName,String password,String dbUrl) {
        super.configure(userName,password,dbUrl);
        this.isAlive = false;
    }

    @Override
    public void connect() {
        // oracle db connection logic
        this.isAlive = true;
        System.out.println("establishing connection");
    }

    @Override
    public void disConnect() {
        this.isAlive=false;
        System.out.println("closing connection");
    }

    @Override
    public boolean isConnectionAlive() {
        return isAlive;
    }
}
