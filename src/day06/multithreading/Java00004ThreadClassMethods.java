package day06.multithreading;

class ThreadsMethods extends Thread{
    public void run(){
        System.out.println("My thread is running");
    }
}

public class Java00004ThreadClassMethods {
    public static void main(String[] args) throws InterruptedException {
        ThreadsMethods tm = new ThreadsMethods();
        //starting method (do not use run for extends threads method)
        tm.start();
        ThreadsMethods tm2 = new ThreadsMethods();
        tm2.start();
        //tm.setDaemon(true);
        //tm.run() //to runt the thread
        System.out.println("Thread Name : "+tm.getName());
        System.out.println("Thread ID  : "+tm.getId());
        System.out.println("Thread Priority : "+tm.getPriority());
        System.out.println("Thread state : "+tm.getState());
        System.out.println("Thread access : "+tm.isAlive());
        System.out.println("Thread isDemon ? : "+tm.isDaemon());

    }
}
