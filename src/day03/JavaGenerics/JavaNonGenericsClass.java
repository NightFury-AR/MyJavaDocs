package day03.JavaGenerics;

class Car {
    public Car(){
        System.out.println("This is Car");
    }
}

class Van {
    public Van(){
        System.out.println("This is Van");
    }
}


class VehiclePlant{
    private Object vehicleType;
    //setter
    public void produceVehicle(Object vehicle) {
        this.vehicleType = vehicle;
    }
    //getter
    public Object deliverVehicle(){
        return vehicleType;
    }
}

public class JavaNonGenericsClass {
    public static void main(String[] args) {
        VehiclePlant v = new VehiclePlant();
        Car c = null;
        v.produceVehicle(new Car());
        Car c1 = (Car) v.deliverVehicle();//casting required;
        v.produceVehicle(new Van());
        Van v1 = (Van) v.deliverVehicle();//casting required;
        //not reusable
    }
}
