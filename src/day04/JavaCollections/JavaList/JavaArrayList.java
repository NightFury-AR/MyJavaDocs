package day04.JavaCollections.JavaList;

import java.util.*;

public class JavaArrayList {
    public static void main(String[] args) {

        //1.creating using array
        String s[] = {"my","boy","!"};
        List<String> fromArray = Arrays.asList(s);
        //2.creating by passing string[]
        List<String> directArray = Arrays.asList(new String[]{"df","Dfgdfg"});
        //3.standard way
        List<String> myArrayList = new ArrayList<>();

        myArrayList.add("hai");
        myArrayList.add("man");
        myArrayList.add("how are you ?");
        System.out.println(myArrayList.size());


        //List iterator
        ListIterator myListIterator = myArrayList.listIterator();
        while (myListIterator.hasNext()) {
            System.out.println(myListIterator.next());
            if(myListIterator.nextIndex()>myArrayList.size()-1) {
                System.out.println("Reached end ");
            }
        }

        //sorting
        //1.using collectionS.sort(); (it uses comparable)
        Collections.sort(myArrayList);
        System.out.println(" sorted using Collections.sort => "+myArrayList);
        //2.using collections sort with comparator
        List<Car> carlist = new ArrayList<>();
        carlist.add(new Car("Audi","TN78",2));
        carlist.add(new Car("porsche","TN78",3));
        carlist.add(new Car("BMW","TN78",4));
        System.out.println("before sort => "+carlist);
        Collections.sort(carlist, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.brand.compareTo(o2.brand);
            }
        });
        System.out.println("after sort => "+carlist);
    }


}

class Car{
    public String brand;
    public String numberPlate;
    public int noOfDoors;

    public Car(String brand, String numberPlate, int noOfDoors) {
        this.brand = brand;
        this.numberPlate = numberPlate;
        this.noOfDoors = noOfDoors;
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' + ", numberPlate='" + numberPlate + '\'' + ", noOfDoors=" + noOfDoors ;
    }
}

class BrandSort implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.brand.compareTo(o2.brand);
    }
}