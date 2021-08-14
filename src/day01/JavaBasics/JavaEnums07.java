package day01.JavaBasics;

// [x] You can also implements your own interface to the enum e.g public enum myEnum implements MyInterface {}

//1. using EnumSet
//2. using EnumMap

import java.util.EnumMap;
import java.util.EnumSet;

public class JavaEnums07 {
    public enum Level {
        CONQUEROR,ACE,ROOKIE,NOOB
    }

    public static void main(String args[]) {

        //1. using enumSet with the help of EnumSet
        System.out.println("1.Enums using EnumSet");
        EnumSet<Level> enumSet = EnumSet.of(Level.CONQUEROR,Level.NOOB);
        System.out.println(enumSet.toString());

        //2. using enumMap with the help of EnumMap
        System.out.println("2.Enums using EnumMap");
        EnumMap<Level,String> enumMap = new EnumMap<Level, String>(Level.class);
        enumMap.put(Level.CONQUEROR,"you are awesome !!!");
        enumMap.put(Level.NOOB,"you a true soldier !!!");
        System.out.println(enumMap.toString());
    }
}
