package day01.JavaOperators;

public class JavaOperatorPrecedence {
    public static void main(String[] args) {
        System.out.println(12+6*3%(1+1));
        //12+6*3%(2)
        //12+18%2
        //12+0
        //12
        //System.out.println((5+(!2+8)*3-3%2)/2);
        //above will not work
        System.out.println((5+(2+8)*3-3%2)/2);
        //(5+(10)*3-3%2)/2
        //(5+30-3%2)/2
        //(5+30-1)/2
        //(35-1)/2
        //34/2
        //17
    }
}
