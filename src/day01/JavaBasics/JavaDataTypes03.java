package day01.JavaBasics;

import com.sun.beans.editors.ByteEditor;

import javax.sound.midi.SysexMessage;

public class JavaDataTypes03 {

    //1.primitive (boolean,numerical)
          //boolean -> boolean
         //numerical => character , Integral
                    //character => char
                   //integral => integer , floating point
                          //integer => byte, short ,int ,long
                          //floating => float double

    public static boolean isAlive;
    public static char tellMeYesORNo;
    public static byte imBelow128;
    public static short imBelow;
    public static int imInt;
    public static long imLong;
    public static float imFloat;
    public static double imDouble;

    //2.non-primitive (classes,enums)



    public static void main(String args[]) {
        System.out.println("----------|-PRIMITIVE TYPE-|-------------- ");
        System.out.println("----------|----------------|-------------- ");
        System.out.println("Data Type | variable name  | default value ");
        System.out.println("----------|----------------|-------------- ");
        System.out.println("boolean   | isAlive        |" +isAlive+"\t MAX_VALUE -> "+Boolean.TRUE+" | MIN_VALUE -> "+Boolean.FALSE);
        System.out.println("char      | tellMeYesORNo  |" +tellMeYesORNo+"\t MAX_VALUE -> "+Character.MAX_VALUE+" | MIN_VALUE -> "+Character.MIN_VALUE);
        System.out.println("byte      | imBelow128     |" +imBelow128+"\t MAX_VALUE -> "+ Byte.MAX_VALUE +" | MIN_VALUE -> "+Byte.MIN_VALUE);
        System.out.println("short     | imBelow        |" +imBelow+"\t MAX_VALUE -> "+Short.MAX_VALUE+" | MIN_VALUE -> "+Short.MIN_VALUE);
        System.out.println("int       | imInt          |" +imInt+"\t MAX_VALUE -> "+Integer.MAX_VALUE+" | MIN_VALUE -> "+Integer.MIN_VALUE);
        System.out.println("int       | imLong         |" +imLong+"\t MAX_VALUE -> "+Long.MAX_VALUE+" | MIN_VALUE -> "+Long.MIN_VALUE);
        System.out.println("int       | imFloat        |" +imFloat+"\t MAX_VALUE -> "+Float.MAX_VALUE+" | MIN_VALUE -> "+Float.MIN_VALUE);
        System.out.println("int       | imDouble       |" +imDouble+"\t MAX_VALUE -> "+Double.MAX_VALUE+" | MIN_VALUE -> "+Double.MIN_VALUE);
        System.out.println("");
        System.out.println("----------|NON PRIMITIVE --|-------------- ");
        System.out.println("");
        JavaDataTypes03 DT = new JavaDataTypes03();
        System.out.println("Reference Variable -> "+DT.toString());
        System.out.println("Class              -> "+ JavaDataTypes03.class.getName());
    }
}
