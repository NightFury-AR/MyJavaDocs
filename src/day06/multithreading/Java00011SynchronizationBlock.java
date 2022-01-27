package day06.multithreading;

class MyTrain {
    private int seatAvailability;
    public MyTrain(int seatAvailability){
        System.out.println("Preparing schedules");
        this.seatAvailability=seatAvailability;
    }

    public int getSeatAvailability() {
        return seatAvailability;
    }

    public boolean bookSeat(int seatCount) {
        boolean isBookingSuccessful = false;
        System.out.println(Thread.currentThread().getName()+": checking train schedule...");
        System.out.println(Thread.currentThread().getName()+": Locating Train...");
        System.out.println(Thread.currentThread().getName()+": Booking is in progress");
        System.out.println(Thread.currentThread().getName()+": preparing seats list...");
        synchronized (this) {
            if(seatAvailability==0 || seatCount>seatAvailability || seatCount<=0 ) {
                isBookingSuccessful=false;
                System.out.println(Thread.currentThread().getName()+": Booking failed!!!");
                isBookingSuccessful=false;
            }
            else{
                seatAvailability = seatAvailability - seatCount;
                System.out.println(Thread.currentThread().getName()+" Booking sucessful...!");
                isBookingSuccessful=true;
            }
        }
        System.out.println(Thread.currentThread().getName()+": preparing chart...");
        System.out.println(Thread.currentThread().getName()+": preparing ad windows...");
        return isBookingSuccessful;
    }
}

class MyTicketBookingThread implements Runnable {
    private MyTrain train;
    private int seatCount;

    public MyTicketBookingThread(MyTrain train,int seatCount) {
        this.train=train;
        this.seatCount=seatCount;
    }

    @Override
    public void run() {
        try{
            if(seatCount<=5){
                Thread.currentThread().setPriority(10);
            }
            if(Thread.currentThread().getPriority()<5){
                Thread.sleep(2000);
            }
            boolean isbooked = train.bookSeat(seatCount);
            System.out.println("user request end with "+(isbooked ? "success":"failed")+ " status");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Java00011SynchronizationBlock {
    public static void main(String[] args) {
        MyTrain train = new MyTrain(18);
        Thread t = new Thread(new MyTicketBookingThread(train,5),"user A");
        Thread t1 = new Thread(new MyTicketBookingThread(train,6),"user B");
        Thread t2 = new Thread(new MyTicketBookingThread(train,4),"user C");
        Thread t3 = new Thread(new MyTicketBookingThread(train,3),"user D");
        Thread t4 = new Thread(new MyTicketBookingThread(train,4),"user E");
        t.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
