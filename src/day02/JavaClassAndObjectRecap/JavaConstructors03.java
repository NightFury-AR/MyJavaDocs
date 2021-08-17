package day02.JavaClassAndObjectRecap;

public class JavaConstructors03 {
    public JavaConstructors03() {
        System.out.println("New Object created !!!");
    }

    public JavaConstructors03(String s) {
        System.out.println("New Object created with param 1 !!! "+ s);
    }

    public JavaConstructors03(String s,int i) {
        System.out.println("New Object created with param 2 !!! "+ s + " "+i);
    }

    public  static void main(String args[]) {
        JavaConstructors03 j = new JavaConstructors03();
        JavaConstructors03 j1 = new JavaConstructors03("with param constructor");
        JavaConstructors03 j2 = new JavaConstructors03("with 2 param",2);
    }
}
