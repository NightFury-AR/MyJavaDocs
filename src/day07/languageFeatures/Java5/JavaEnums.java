package day07.languageFeatures.Java5;

import day01.JavaBasics.JavaEnums07;

import java.util.EnumMap;
import java.util.EnumSet;

public class JavaEnums {

    //1.basic enum
    public enum Level { //a.defining
        NOOB,ROOKIE,ACE,CONQUEROR,
    }

    //2.enum with field
    public enum LevelWithBadge {
        NOOB(4),ROOKIE(3),ACE(2),CONQUEROR(1);
        private int badge;
        LevelWithBadge(int badge){
            this.badge=badge;
        }
        public int getBadge(){
            return this.badge;
        }
    }
    //3.Enum with methods
    public enum LevelRewards {
        CONQUEROR {
            @Override
            public String getRewards() { return "Conqueror clothing set, premium guns,cars"; }
        },
        ACE {
            @Override
            public String getRewards() { return "Ace clothing set, premium guns";}
        }, ROOKIE {
            @Override
            public String getRewards() {
                return "Ordinary clothing set, normal guns";
            }
        }, NOOB {
            @Override
            public String getRewards() {
                return "Ordinary Hat.";
            }
        };
        public abstract String getRewards();
    }


    public static void main(String[] args) {
        /*
        1.enum basic
        ==============================================================================================
        */
        Level l = Level.NOOB; //b.assigning
        //printing
        System.out.println("Three ways we can print enums \n 1."+l+"\n 2."+l.toString()+"\n 3."+Level.valueOf("NOOB"));
        System.out.println("Name is "+l.name());
        for (Level value:Level.values()) {
            System.out.println(value);
        }
        /*
        you can implement if check, switch with enums
        ================================================================================================
        */

        //2.Enum with fields
        System.out.println(LevelWithBadge.NOOB.getBadge());

        //3.Enum with methods
        System.out.println(LevelRewards.NOOB.getRewards());

        //4. EnumSet , EnumMap
        //1. using enumSet with the help of EnumSet
        System.out.println("1.Enums using EnumSet");
        EnumSet<JavaEnums07.Level> enumSet = EnumSet.of(JavaEnums07.Level.CONQUEROR, JavaEnums07.Level.NOOB);
        System.out.println(enumSet.toString());

        //2. using enumMap with the help of EnumMap
        System.out.println("2.Enums using EnumMap");
        EnumMap<JavaEnums07.Level,String> enumMap = new EnumMap<JavaEnums07.Level, String>(JavaEnums07.Level.class);
        enumMap.put(JavaEnums07.Level.CONQUEROR,"you are awesome !!!");
        enumMap.put(JavaEnums07.Level.NOOB,"you a true soldier !!!");
        System.out.println(enumMap.toString());
    }
}
