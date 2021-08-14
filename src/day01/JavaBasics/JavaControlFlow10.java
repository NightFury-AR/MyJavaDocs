package day01.JavaBasics;

//1. if , if-else, if,else-if......,else
//switch

public class JavaControlFlow10 {
    public static void main(String args[]) {
        int i = 100;
        //1.if
        if(i<101) {
            System.out.println("1.Inside If");
        }

        //2.if-elseif-else
        if(i<150) {
            System.out.println("2..Inside If");
        }
        else if (i<125) {
            System.out.println("2.inside else if");
        }
        else {
            System.out.println("2.inside else");
        }
        int number = 1;
        //2.switch
        switch (number) {
            case 0:
                System.out.println("case 0");
                break;
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            default:
                System.out.println("default");
        }
    }
}
