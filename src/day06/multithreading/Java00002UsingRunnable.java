package day06.multithreading;

class Robo implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello!, i'm rob");
    }
}


 class JavaUsingRunnable {
    public static void main(String[] args) {
        Robo r = new Robo();
        Thread t = new Thread(r);
        t.start();
    }
}
