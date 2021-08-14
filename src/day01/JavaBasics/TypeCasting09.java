package day01.JavaBasics;

public class TypeCasting09 {

    public byte byteValue;
    public short shortValue;
    public int intValue;
    public long longValue;
    public float floatValue;
    public double doubleValue;

    public static void main(String args[]) {
        //narrowing big to small
        TypeCasting09 NarrowingCast = new TypeCasting09();
        NarrowingCast.byteValue = 120;
        NarrowingCast.shortValue = 1200;
        NarrowingCast.intValue = 1305656;
        NarrowingCast.longValue = 123123213L;
        NarrowingCast.floatValue = 10.454f;
        NarrowingCast.doubleValue = 12313224.23;

        // narrowing/explicit conversion type conversion
        float f = (float) NarrowingCast.doubleValue; // double to float
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        char c = (char) s;
        byte b = (byte) s;
        System.out.println("Narrowing / Explicit conversion ");
        System.out.println(" Original Value (double data type) => "+NarrowingCast.doubleValue);
        System.out.println(" After converting it to float "+f);
        System.out.println(" After converting it to long "+l);
        System.out.println(" After converting it to int "+i);
        System.out.println(" After converting it to short "+s);
        System.out.println(" After converting it to char "+c);
        System.out.println(" After converting it to byte "+b);
        // widening/implicit conversion type conversion
        byte b1 = 123;
        short s1 = b1;
        int i1 = s1;
        long l1 = i1;
        float f1 = l1;
        double d1 = f1;
        System.out.println("Widening  / Implicit conversion ");
        System.out.println(" Original Value (byte data type) => "+b1);
        System.out.println(" After converting it to short "+s1);
        System.out.println(" After converting it to int "+i1);
        System.out.println(" After converting it to long "+l1);
        System.out.println(" After converting it to float "+f1);
        System.out.println(" After converting it to double "+d1);






    }
}
