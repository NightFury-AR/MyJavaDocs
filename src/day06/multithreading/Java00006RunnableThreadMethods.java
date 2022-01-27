package day06.multithreading;

class RunnableMethod implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello Boooyzzzz !");
    }
}

public class Java00006RunnableThreadMethods {
    public static void main(String[] args) {
        RunnableMethod jr = new RunnableMethod();
        jr.run();
    }
}
