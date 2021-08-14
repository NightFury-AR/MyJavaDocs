package day01.JavaOperators;

public class BitWiseOperators {
    public static int a,b,c;
    public static void main(String[] args) {
        a=0;b=1;c=5;
        System.out.println(" Here a = "+a+",b = "+b+" ,c = "+c);

        System.out.println("1.Bitwise AND (&)");
        System.out.println(" a & b => "+(a&b)+"\n");

        System.out.println("2.Bitwise OR (|)");
        System.out.println(" a | b => "+(a|b)+"\n");

        System.out.println("3.Bitwise Exclusive OR (^)");
        System.out.println(" a ^ b => "+(a^b)+"\n");

        System.out.println("4.Shift Left ( << ) c=5");
        System.out.println("c << 2 => "+(c<<2)+" (.i.e. 5*(2power2) => 5*(2*2) => 5(4) => 20 )"+"\n");

        System.out.println("5.Shift Right ( >> ) ");
        System.out.println("c >> 2 => "+(c>>2)+" (.i.e. 5/(2power2) => 5/(2*2) => 5/4 => 1 )"+"\n");

        System.out.println("6.Bitwise Unary NOT ( ~ ) ");
        System.out.println(" ~ a => "+(~a)+"\n");

        System.out.println("7.Bitwise AND assignment ( &= )");
        System.out.println(" a &= b (a=a&b) => "+(a&=b)+"\n");

        System.out.println("8.Bitwise OR assignment ( |= )");
        System.out.println(" a |= b (a=a|b) => "+(a|=b)+"\n");

        System.out.println("9.BitWise Exclusive OR assignment ( ^= ) ");
        System.out.println(" a ^= b (a=a^b) => "+(a^=b)+"\n");

        System.out.println("10.Shift Left Assignment ( <<= ) c=5 ");
        System.out.println("c <<= 2 => "+(c<<=2)+" \n(c = c << 2) (.i.e. c =  (5*(2power2) => 5/(2*2) => 5/4 => 1 )"+"\n");
        c=5;
        System.out.println("11.Shift Right Assignment ( >>= ) c=5 ");
        System.out.println("c >>= 2 => "+(c>>=2)+" \n(c = c << 2) (.i.e. c =  (5/(2power2) => 5/(2*2) => 5/4 => 1 )"+"\n");
    }
}
