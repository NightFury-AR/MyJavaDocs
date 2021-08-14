package day01.JavaBasics;

import java.lang.reflect.Field;

//class
public class JavaClassAndObjects02 {
    private String button;
    private int speakers;
    private String brand;
    public int gh;
    //constructor
    public JavaClassAndObjects02 () {
        System.out.println("Radio Manufacturing Finished!");
    }
    public JavaClassAndObjects02(String brand) {
        this.brand = brand;
    }
    //radio have buttons and speakers
    public void increaseVolume() {
        System.out.println(this.brand+" : Volume increased!");
    }
    public void changeTheChannel() { System.out.println(this.brand+" :Channel changed!"); }

    public static void main(String args[]) throws NoSuchFieldException {
        //object
        JavaClassAndObjects02 SonyRadio = new JavaClassAndObjects02("Sony");
        SonyRadio.increaseVolume();
        SonyRadio.changeTheChannel();
        JavaClassAndObjects02 PhilipsRadio = new JavaClassAndObjects02("Philips");
        PhilipsRadio.increaseVolume();
        PhilipsRadio.changeTheChannel();

        //each and every object will have this below 4 methods
        //object methods
        //1..equals()
        //2.hashCode()
        //3.toString()
        //4. getClass()
        //1.using equals
        System.out.println("both radios are same ? "+ (SonyRadio.equals(PhilipsRadio) ? "yes" : "no"));
        //2.using hashcode
        System.out.println("both object using same address ? "+ (SonyRadio.hashCode()==PhilipsRadio.hashCode() ? "yes" : "no"));
        //3. using toString
        System.out.println("printing address for Sony object : "+SonyRadio.toString());
        //4. getClass
        System.out.println("using get class for Sony object : "+SonyRadio.getClass());

    }
}
