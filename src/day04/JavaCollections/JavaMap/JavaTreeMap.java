package day04.JavaCollections.JavaMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class JavaTreeMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        // put(Integer key, String value)
        map.put(1,"CONQUEROR");
        map.put(2,"ACE");
        map.put(3,"CROWN");
        map.put(4,"Diamond");
        map.put(5,"platinum");
        map.put(6,"gold");
        System.out.println("Tree Map : "+map);

        // putAll(Map<? extends Integer, ? extends String> m)
        map.putAll(map);
        System.out.println(" Tree Map : "+map);

        //containsKey(Object key)
        System.out.println(" contains key 3 ? : "+map.containsKey(3));

        // containsValue(Object value)
        System.out.println(" contains value \"ACE\" ? "+map.containsValue("ACE"));

        // get(Object key)
        System.out.println(" map get(3)  : "+map.get(3));

        // remove(Object key)
        System.out.println(" map remove : "+map.remove(6));

        // keySet()
        System.out.println(" map keyset "+map.keySet());

        // values()
        System.out.println(" map values "+map.values());

        // entrySet()
        System.out.println(" map entry set "+map.entrySet());

    }
}
