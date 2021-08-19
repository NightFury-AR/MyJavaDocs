package day03.JavaNumbersAndStrings;

//java Number class subtype(Byte,Short,Integer,Long,Float,Double)
//1.conversion methods
//Integer x = 12;
//x.byteValue();
//x.shortValue();
//x.intValue();
//x.longValue();
//x.floatValue();
//x.doubleValue();
//2.compareTo



public class JavaNumbers {
    public static void main(String[] args) {
        Integer subTypeOfNumber = 127;// you can use Float,Double..etc.,
        System.out.println("Byte : "+subTypeOfNumber.byteValue());
        System.out.println("Short : "+subTypeOfNumber.shortValue());
        System.out.println("Int : "+subTypeOfNumber.intValue());
        System.out.println("Long : "+subTypeOfNumber.longValue());
        System.out.println("Float : "+subTypeOfNumber.floatValue());
        System.out.println("Double : "+subTypeOfNumber.doubleValue());

        System.out.println("compare type (compare to) : "+subTypeOfNumber.compareTo(0));
        System.out.println("compare data (equals): "+subTypeOfNumber.equals(12));
        System.out.println("compare data (toString) : "+subTypeOfNumber.toString());
        System.out.println("compare data : (hashCode) "+subTypeOfNumber.hashCode());

    }
}
