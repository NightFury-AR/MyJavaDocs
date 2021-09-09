package day04.JavaCollections.JavaMap;

import day01.JavaBasics.JavaEnums07;

import java.util.EnumMap;

public class JavaEnumMap {
    public enum Level {
        ACE,ROOKIE,NOOB
    }

    public static void main(String[] args) {
        System.out.println("2.Enums using EnumMap");
        EnumMap<Level,String> enumMap = new EnumMap<Level, String>(Level.class);
        enumMap.put(Level.ACE,"Ace player");
        enumMap.put(Level.NOOB,"Noobieeee");

    }

}
