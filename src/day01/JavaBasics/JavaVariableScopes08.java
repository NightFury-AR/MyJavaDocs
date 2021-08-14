package day01.JavaBasics;

public class JavaVariableScopes08 {
    int i = 1000;//instance variable
    static int j = 2000;//static variable
    JavaVariableScopes08() {
        int j = 100;//local variable
        System.out.println("I'm from constructor scope(Local) "+j);
    }

    public void iHaveLocalVariables() {
        int i = 777;//local variable
        i++;
        System.out.println("I'm from local variable scope(Local) "+i);
    }

    public static void main(String args[]) {
        JavaVariableScopes08 J = new JavaVariableScopes08();
        J.i++;
        J.iHaveLocalVariables();
        System.out.println("I'm from instance variable scope "+J.i);
        System.out.println("I'm from static variable scope "+JavaVariableScopes08.j);
    }
}
