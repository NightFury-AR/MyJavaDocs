package day03.JavaGenerics;

//using generics with multiple arguments K,V


import java.util.ArrayList;
import java.util.List;

interface CarSpecs<K,V> {
    public K getModel();
    public V getColor();
}

class VehicleFactory<K,V> implements CarSpecs<K,V> {
    private K model;
    private V color;

    public void setModel(K k) {
        this.model = k;
    }

    public void setColor(V v){
        this.color = v;
    }

    @Override
    public V getColor() {
        return this.color;
    }

    @Override
    public K getModel() {
        return this.model;
    }
}

public class JavaGenerics02 {
    public static void main(String[] args) {
        //multiparams
        VehicleFactory<Integer,String> vf = new VehicleFactory<>();
        vf.setColor("black");
        vf.setModel(1001);
        System.out.println("Car created with model-"+vf.getModel()+" color: "+vf.getColor());


        //parameterized types
        VehicleFactory<Integer, List<String>> dualColorProduction = new VehicleFactory<>();

        List<String> colors = new ArrayList<String>();
        colors.add("gold");
        colors.add("black");

        dualColorProduction.setModel(1007);
        dualColorProduction.setColor(colors);
        System.out.println("Car created with model-"+dualColorProduction.getModel()+" color: "+dualColorProduction.getColor().toString());
    }
}
