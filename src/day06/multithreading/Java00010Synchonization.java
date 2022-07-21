package day06.multithreading;

class BookingSeat {
    private static int availableSeats;

    public BookingSeat(int availableSeats) {
        this.availableSeats=availableSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    //when you use synchronized keyword in method whole objects gets locked
    public synchronized boolean bookSeat(int totalSeats) {
        boolean isBooked;
        isBooked=false;
        System.out.println("booking processing for the "+Thread.currentThread().getName()+" for "+totalSeats+" seats");
        if (availableSeats==0){
            System.out.println(Thread.currentThread().getName()+" : No Seats available..");
            //return -1 if no seats available
            isBooked = false;
            return isBooked;
        }
        if(availableSeats<totalSeats){
            System.out.println(Thread.currentThread().getName()+" : no required seats are available");
            isBooked=false;
            return isBooked;
        }
        availableSeats = availableSeats-totalSeats;
        isBooked = true;
        return isBooked;
    }

}



class MyWorkerThreads implements Runnable {
    private int requiredSeats;
    private BookingSeat seatClass;
    public MyWorkerThreads(BookingSeat seatClass,int requiredSeats) {
        this.requiredSeats = requiredSeats;
        this.seatClass = seatClass;
    }
    @Override
    public void run() {
        boolean bookingStatus=seatClass.bookSeat(requiredSeats);
        //if booking status true , do the payment and etc...
        System.out.println(Thread.currentThread().getName()+ (bookingStatus ? ": Booking successful" : ": Booking failed "));
    }
}

public class Java00010Synchonization {
    public static void main(String[] args) {
        //setting available seats
        BookingSeat b = new BookingSeat(20);
        //creating dummy users with their required seat
        Thread user1 = new Thread(new MyWorkerThreads(b,5),"user_1");
        Thread user2 = new Thread(new MyWorkerThreads(b,4),"user_2");
        Thread user3 = new Thread(new MyWorkerThreads(b,1),"user_3");
        Thread user4 = new Thread(new MyWorkerThreads(b,2),"user_4");
        Thread user5 = new Thread(new MyWorkerThreads(b,2),"user_5");
        Thread user6 = new Thread(new MyWorkerThreads(b,4),"user_6");
        Thread user7 = new Thread(new MyWorkerThreads(b,2),"user_7");
        Thread user8 = new Thread(new MyWorkerThreads(b,5),"user_8");
        Thread user9 = new Thread(new MyWorkerThreads(b,7),"user_9");
        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();
        user6.start();
        user7.start();
        user8.start();
        user9.start();
    }
}
