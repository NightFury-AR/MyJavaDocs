package day06.multithreading;

class DoodThread implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+": Eating...");
        System.out.println(name+": Sleeping...");
        try{
            if(Thread.currentThread().getPriority()<=5) {
                Thread.sleep(5000);
            }
            else {
                Thread.sleep(2000);
            }
            System.out.println(name+": coding...");
            //System.out.println(name+": "+Thread.currentThread().getState());
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



public class Java00008UsingSleepMethod {
    public static void main(String[] args) {
        Thread dood1 = new Thread(new DoodThread(),"DOOD_01");
        Thread dood2 = new Thread(new DoodThread(),"DOOD_02");
        dood1.setPriority(5);
        dood2.setPriority(7);
        dood1.start();
        dood2.start();
    }
}
