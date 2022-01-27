package day06.multithreading;

//i want to sleep only one thread

class MyThread implements Runnable {

    @Override
    public void run() {
        try {
            if(Thread.currentThread().getPriority()==5) {
                Thread.sleep(10000);
            }
            String name = Thread.currentThread().getName();
            System.out.println("Executing "+name);
            System.out.println(name+" : "+Thread.currentThread().getState());
            System.out.println(name+" : Execution about to end");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//join method used to wait the current thread untill the join thread completes its execution
public class Java00005ThreadsJoinMethod {
    public static void main(String[] args) throws InterruptedException {
        MyThread m = new MyThread();
        Thread t = new Thread(m);
        Thread t2 = new Thread(m);
        t.setPriority(5);
        t2.setPriority(10);
        t.start();
        t2.start();
        t2.join();
    }
}
