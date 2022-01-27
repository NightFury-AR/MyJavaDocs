package day06.multithreading;

class Rob1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello!, i'm rob");
    }
}
 class JavaUsingRunnable {
    public static void main(String[] args) {
        Rob1 r = new Rob1();
        Thread t = new Thread(r);
        t.start();
    }
}
