package day02.JavaPolyMorphism;

//same methods differed by parameter
public class MethodOverloading {
    public void run() {
        System.out.println("Running in normal Speed");
    }
    public void run(int speed) {
        System.out.println("Running in "+speed+" km(s) speed");
    }

    public static void main(String args[]) {
        MethodOverloading action = new MethodOverloading();
        action.run();
        action.run(90);

    }
}
