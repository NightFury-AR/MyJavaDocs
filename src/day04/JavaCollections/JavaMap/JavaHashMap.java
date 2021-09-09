package day04.JavaCollections.JavaMap;

import java.util.*;

class Node{
    public String key;
    public int hashKey;
    public int value;
    public Node next;

    @Override
    public String toString() {
        return "key='" + key + " " +"hashKey= " + hashKey +", value=" + value +"next=" + next;
    }
}

//it uses hashtable to store the values
public class JavaHashMap {
    public static void main(String[] args) {

        //1.creating hashmap 4 ways
        Map<String,Integer> defaultMap = new HashMap<>();//capacity = 16 , loadfactor - .75
        Map<String,Integer>  withCapacity = new HashMap<>(4);
        Map<String,Integer> withCapacityLoadFactor = new HashMap<String,Integer>(30,20.0f);
        Map<String,Integer> withAnotherMap = new HashMap<>(withCapacity);

        //2.adding
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("CONQUEROR",10000);
        hashMap.put("ACE",5000);
        hashMap.put("CROWN",1000);
        hashMap.put("DIAMOND",800);
        hashMap.put("GOLD",600);
        hashMap.put("PLATINUM",300);
        hashMap.put("NOOBNOOBNOOB",100);
        hashMap.size();

        //now each map object will have key,value,hash,next if both having same hashing
        Map<Integer, List<Node>> internalStructure = new TreeMap<>();
        for (String key: hashMap.keySet()) {
            System.out.println(key);
            if(internalStructure.containsKey( (key.hashCode() & (hashMap.size()-1)) )) {
                Node v = new Node();
                v.hashKey = (key.hashCode() & (hashMap.size()-1));
                v.key = key;
                v.value = hashMap.get(key);
                v.next = null;
                internalStructure.get(v.hashKey).add(v);
                v=null;
            }
            else {
                List<Node> nodes = new ArrayList<>();
                Node n = new Node();
                n.key = key;
                n.hashKey = (key.hashCode() & (hashMap.size()-1));
                n.value = hashMap.get(key);
                n.next = null;
                nodes.add(n);
                n=null;
                internalStructure.put((key.hashCode() & (hashMap.size()-1)),nodes);
            }
        }

        System.out.println(" Internal structure ");
        //printing internal structure
        for (int k: internalStructure.keySet()) {
            System.out.println("Key "+k);
            for (Node n:internalStructure.get(k)) {
                System.out.println(n.toString());
            }
        }
    }
}
