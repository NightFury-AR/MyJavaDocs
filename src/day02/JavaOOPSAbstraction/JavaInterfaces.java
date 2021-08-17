package day02.JavaOOPSAbstraction;

//interface
interface TV {
    public String hello = "hello!";

    void sayHello();// java assumes this as a abstract by default
    void sayHi();

}

public class JavaInterfaces implements TV {
    @Override
    public void sayHello() {
        System.out.println(TV.hello);
    }

    @Override
    public void sayHi() {
        System.out.println("Hi !");
    }
}
