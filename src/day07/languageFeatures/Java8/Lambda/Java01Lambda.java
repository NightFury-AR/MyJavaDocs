package day07.languageFeatures.Java8.Lambda;

@FunctionalInterface
interface calculate {
    //must have only one abstract method
    public abstract int addTwoNumbers(int a,int b);

    //can have any number of default implementation
    default int addTWO(int a,int b){
        return a+b;
    }
}



public class Java01Lambda {
    public static void main(String[] args) {
        
    }
}
