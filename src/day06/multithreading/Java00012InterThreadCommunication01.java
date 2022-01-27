package day06.multithreading;

class MyThreadTruck implements Runnable {
    private String deliverAddress;
    private boolean isDelivered;
    private String cities[] = {"A","B","C","D","E","F","G","H","I","J","K"};
    public MyThreadTruck(String deliverAddress){
        this.deliverAddress = deliverAddress;
    }
    @Override
    public void run() {
        String truckName = Thread.currentThread().getName();
        System.out.println("Delivery "+truckName+" Root");
        System.out.println(truckName+": 🚩 City A ---> 🚩 City B ---> 🚩 City C ----> 🚩 City D");
        try{
            for (int i=0;i<cities.length;i++){
                deliverPackages(cities[i]);
            }
            System.out.println(truckName+": All packages delivered 😎");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deliverPackages(String cityName) {
        if (cityName==deliverAddress){
                System.out.println(Thread.currentThread().getName()+": 📌 Truck Reached Your destination City "+cityName);
                System.out.println(Thread.currentThread().getName()+": 🎁 Truck delivered package to Dood @ City "+cityName);
            synchronized (this){
                isDelivered=true;
                //as soon as item reached to delivery city address , then we inform dood to collect his packages
                this.notify();
            }

        }
        System.out.println(Thread.currentThread().getName()+": Truck delivered all packages to City "+cityName);
        System.out.println(Thread.currentThread().getName()+": Truck Crossed City 🚚 "+cityName);
    }

    public boolean getDeliveryStatus() {
        return isDelivered;
    }
}

public class Java00012InterThreadCommunication01 {
    public static void main(String[] args) throws InterruptedException{
        // Dood ordered something.
        // but delivery partner don't have tracking facility for user.
        // they will call once the package arrived at user's delivery location

        // package is in progress
        MyThreadTruck deliverItem = new MyThreadTruck("B");
        Thread truck = new Thread(deliverItem);
        truck.start();

        // Dood is main thread and he is waiting for his package
        synchronized (deliverItem){ // thread can deliver packages to one city at a time (so synchronized)
            deliverItem.wait();
        }
        System.out.println((deliverItem.getDeliveryStatus())?" dood collecting his package":"Item not yet delivered to dood 😑");
        System.out.println("========================================");
        System.out.println("Dood got his package and having fun.....🕺🕺🕺🕺🕺");
        System.out.println("========================================");
    }
}
