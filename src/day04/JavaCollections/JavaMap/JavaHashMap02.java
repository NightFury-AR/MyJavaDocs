package day04.JavaCollections.JavaMap;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap02 {
    public static void main(String[] args) {
        Map<String,Integer> hMap = new HashMap<>();
        hMap.put("Hello",1);
        hMap.put("hai",2);
        hMap.put("hey",3);
        hMap.put("awesome",4);
        for (String key:hMap.keySet()) {
            //System.out.println(key + "Hashing ");
            //System.out.println(" "+key+".hashCode => "+key.hashCode());
            //System.out.println(" mapSize - 1 => "+(hMap.size()-1));
            //System.out.println(" hashing will be => (key.hashcode() & (size - 1) ");
            //System.out.println("                    "+(key.hashCode())+" & "+(hMap.size()-1));
            //System.out.println(" bit manipulation "+Integer.toBinaryString(key.hashCode()));
            //System.out.println("                  "+Integer.toBinaryString((hMap.size()-1)));
            System.out.println(" "+key +" - "+key.hashCode()+" hashing is "+ (key.hashCode() & hMap.size()-1));
        }

    }
}
