package day01.JavaOperators;

public class ArithmeticOperator {
    public static int a=2,b=4;

    public static void main(String[] args) {
        System.out.println(" a = "+a+", b = "+b);
        System.out.println("1.Addition");
        System.out.println(" a + b => "+ (a+b));
        System.out.println("2.Subtraction");
        System.out.println(" a - b => "+ (a - b));
        System.out.println("3.Multiplication");
        System.out.println(" a * b => "+ (a*b));
        System.out.println("4.Division");
        System.out.println(" a / b => "+ (b/a));
        System.out.println("5.Modulus a%10");
        System.out.println(" a % b => "+ (b%10));
        System.out.println("6.Addition Assignment");
        System.out.println(" a += b (a=a+b) => "+ (a+=b));
        System.out.println("7.Subtraction Assignment");
        a=2;b=4;
        System.out.println(" a -= b (a=a-b) => "+ (a-=b));
        a=2;b=4;
        System.out.println("8.Multiplication Assignment");
        System.out.println(" a *= b (a=a*b) => "+ (a*=b));
        System.out.println("9.Division Assignment");
        System.out.println(" a /= b (a=a/b) => "+ (a/=b));
        System.out.println("10.Modulus Assignment");
        System.out.println(" a %= b (a=a%b) => "+ (a%=b));
        a=2;b=4;
        System.out.println("11.Increment");
        System.out.println(" a++  (a=a+1) => "+ (a++) + " next a occurrence will be 2+1 => 3 ");
        System.out.println(" ++b  (b=b+1) => "+ (++b) + " instance action");
        System.out.println("12.Decrement");
        a=2;b=4;
        System.out.println(" a--  (a=a-1) => "+ (a--)  + " next a occurrence will be 2-1 => 2 ");
        System.out.println(" --b  (b=b-1) => "+ (--b) + " instance action");



    }
}
