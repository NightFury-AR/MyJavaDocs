package day03.JavaGenerics;

class VehiclePlantNew<T> {
    private T vehicleType;
    //setter
    public void produceVehicle(T t) {
        this.vehicleType = t;
    }
    //getter
    public T deliverVehicle() {
        return vehicleType;
    }
}

public class JavaGenerics01 {
    public static void main(String[] args) {
        //car
        VehiclePlantNew<Car> vehiclePlant = new VehiclePlantNew<>();
        vehiclePlant.produceVehicle(new Car());
        //van
        VehiclePlantNew<Van> vehiclePlant1 = new VehiclePlantNew<>();
        //vehiclePlant1.produceVehicle(new Car());// as you can see compile time error
        vehiclePlant1.produceVehicle(new Van());

    }
}
