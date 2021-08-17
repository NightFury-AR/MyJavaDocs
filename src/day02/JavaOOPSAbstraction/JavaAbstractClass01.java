package day02.JavaOOPSAbstraction;

//abstract class
abstract class Person {
    private String name;
    private String gender;
    public Person(String nm, String gen) {
        this.name = nm;
        this.gender = gen;
    }
    //abstract method
    public abstract void Studying();

    @Override
    public String toString() {
        return "Name=" + this.name + "::Gender=" + this.gender;
    }
}

//actual class which is using abstract class features
public class JavaAbstractClass01 extends Person{
    private int StudentID;

    public JavaAbstractClass01(String nm, String gen, int id) {
        //setting custom values to abstract class
        super(nm, gen);
        this.StudentID = id;
    }

    @Override
    public void Studying() {
        if (StudentID == 0) {
            System.out.println("Not Studying");
        } else {
            System.out.println("Pursuing a Degree in Bachelor of Engineering");
        }
    }

    public static void main(String args[]) {
        Person student = new JavaAbstractClass01("BlackWindow", "Female", 0);
        Person student1 = new JavaAbstractClass01("Captain", "Male", 201021);
        Person student2 = new JavaAbstractClass01("Tony", "Female", 101021);
        Person student3 = new JavaAbstractClass01("Sam", "Male", 201661);
        student.Studying();
        student1.Studying();
        student2.Studying();
        student3.Studying();
        System.out.println(student.toString());
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}
