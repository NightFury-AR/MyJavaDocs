package day06.multithreading;

// creating threads using Thread class
class Robot1 extends Thread {
    public void run(){
        System.out.println("Robo 1 started");
    }
}

class Robot2 extends Thread {
    public void run(){
        System.out.println("Robo 2 started");
    }
}

public class Java00001UsingThread {
    public static void main(String[] args) {
        Robot1 r = new Robot1();
        r.setName("Robo 1");
        Robot2 r2 = new Robot2();
        r2.setName("Robo 2");
        Robot1 r3 = new Robot1();
        r3.setName("Robo 1 v2");
        r.start();
        r2.start();
        r3.start();
    }
}
