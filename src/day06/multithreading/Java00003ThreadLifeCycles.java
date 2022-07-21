package day06.multithreading;

class TrackLifeCycle implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("\n===============================");
            System.out.println("Thread Execution");
            System.out.println("Hello Guys, i'm alive now !!!");
            System.out.println("===============================\n");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


public class Java00003ThreadLifeCycles {
    public static void main(String[] args) throws InterruptedException {

        TrackLifeCycle t = new TrackLifeCycle();
        Thread th= new Thread(t);
        // NEW state
        System.out.println("As soon as thread is created , its state is "+th.getState());

        //Runnable State
        th.start();
        System.out.println("once its started , its state is "+th.getState());

        //Running State
        System.out.println("once its picked by schedular then its state is "+(th.isAlive() ? "Running":"Terminated"));
        // th.wait(5000);
        //Blocked State
        System.out.println("when it is waiting for some resources , then it is "+th.getState());

    }
}
