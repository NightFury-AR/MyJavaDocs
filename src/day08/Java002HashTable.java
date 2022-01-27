package day08;

import java.util.Arrays;
import java.util.Hashtable;

// find recurring char
public class Java002HashTable {

    public static<E> E recurringItem (E[] e) {
        Hashtable<E,Integer> hashtable = new Hashtable<>();
        if(e.length==0 || e.length==1){
            return null;
        }
        for (E element: e) {
            if(hashtable.containsKey(element)){
                System.out.println("contains "+element);
                return element;
            }
            else {
                System.out.println("adding " +element);
                hashtable.put(element,1);
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,2,1,3,45,6};
        System.out.println(Arrays.toString(arr) +" recurring item is => "+recurringItem(arr));
    }
}
