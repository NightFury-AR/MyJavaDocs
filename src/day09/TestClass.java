package day09;

import java.io.Serializable;
import java.util.HashMap;

public class TestClass implements Serializable {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("Pave","Engineering");
        hashMap.put("Ravi","Civil");
        hashMap.put("Reka","Engineering");
        hashMap.put("Moni","Medical");

        for(String i :hashMap.keySet()) {
            System.out.println("Key :"+i+"  value : "+hashMap.get(i));
        }

        int[] arr = new int[]{1,2,3,4,5,7,8};
        int n = arr.length+1; // consider 8 element bcoz 1 is already missing
        int sumOfElements = (n * (n+1))/2; // formula for 1....n sum
        int calculatedSum = 0;
        for (int i = 0; i < arr.length; i++) {
            calculatedSum+=arr[i];
        }
        //1...n minus our array sums
        System.out.println("Missing element is "+(sumOfElements-calculatedSum));


    }


}









