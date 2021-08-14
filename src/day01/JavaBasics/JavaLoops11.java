package day01.JavaBasics;
//loops
//1.while loop (do-while , while)
//2.for loop

public class JavaLoops11 {
    public static void main(String[] args) throws InterruptedException {
        int a = 10;
        //1.do-while
        do {
            System.out.println("Hello");// no matter what it always execute the do block whether while condition true or false.
        }while ( a > 10);
        //2.while
        while (a>5) {
            System.out.println("Hello from Universe "+a);
            a--;
        }
        //3.for loop
        System.out.println(" Normal for loop");
        for (int i=0;i<=5;i++) {
            System.out.println(i);
        }
        System.out.println(" Infinite for loop");
        //4.for loop - infinite
        for (;;) {
            System.out.println("hi");
            break;
        }
        //5.for loop - enhanced
        System.out.println(" Enhanced for loop");
        int arr[] = {1,2,3,4,5};
        for(int i:arr) {
            System.out.println(i);
        }

        //6. labeled for loop
        System.out.println(" Labeled for loop");
        loop1:   for(int i=1;i<=10;i++)
        {
            System.out.println();
            loop2:   for(int j=1;j<=10;j++)
            {
                System.out.print(j + " ");
                if(j==5)
                    break loop1;     //Statement 1
            }
        }
    }
}
