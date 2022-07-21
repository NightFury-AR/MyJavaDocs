package day09.d01_creational_pattern.dp01_factory_pattern.example01.factory_products.types;

public abstract class DB {

    private String userName;
    private String password;
    private String dbUrl;

    public abstract void connect();
    public abstract void disConnect();
    public abstract boolean isConnectionAlive();

    protected void configure(String userName,String password,String dbUrl) {
        this.userName=userName;
        this.password=password;
        this.dbUrl=dbUrl;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getDbUrl() {
        return dbUrl;
    }
}
