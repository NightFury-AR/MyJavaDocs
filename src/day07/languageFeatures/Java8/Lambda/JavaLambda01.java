package day07.languageFeatures.Java8.Lambda;

interface WithOutParam {
    public void getInfo();
}

interface WithParam {
    public void getInfo(String msg);
}

interface WithReturn {
    public int returnBig(int a,int b);
}

public class JavaLambda01 {
    public static void main(String[] args) {

        WithOutParam woP = () -> {
            System.out.println("i'm dummy");
        };

        WithParam wP = msg -> {
            System.out.println(msg+" hwwwww");
        };

        WithReturn wR = (int a,int b) -> {
            return a>b ? a : b;
        };

        woP.getInfo();
        wP.getInfo("Hello ");
        System.out.println(wR.returnBig(10,5));
    }
}
