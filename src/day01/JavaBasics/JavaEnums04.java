package day01.JavaBasics;

//1.defining enums
//2.assigning enum
//3.printing enum
//4.checking enum using if statement
//5.enum with switch statement
//6.iterate the enum values with help of values() and for loop

public class JavaEnums04 {

    //1.defining enums
    public enum Level {
        CONQUEROR,ACE,ROOKIE,NOOB
    }

    public static void main(String[] args) {
        //2.assigning enum
        Level l = Level.NOOB;

        //3.Printing enum
        //while printing automatically uses .toString() method.
        System.out.println("2.Printing current enum value: "+ l);
        System.out.println("ToString : "+l.toString());
        System.out.println("ValueOf  : "+Level.valueOf("NOOB"));

        //4.checking enum using if statement
        if(l==Level.ROOKIE)
            System.out.println("You are Rookie");
        else
            System.out.println("You Are "+l + " !!!");

        //5.enum with switch statement
        System.out.println("3.Using Enum Inside Switch");
        switch (l) {
            case NOOB:
                System.out.println("you are Noob!!!");
                break;
            case ROOKIE:
                System.out.println("you are Rookie!!!");
                break;
            case ACE:
                System.out.println("You are ACE !!!");
                break;
            case CONQUEROR:
                System.out.println("You are Conqueror!!!");
                break;
            default:
                System.out.println("Please register yourself to know your level");
                break;
        }

        //6.iterate the enum values with help of values() and for loop
        System.out.println("4.Iterating Enum using For");
        for(Level l2 : Level.values()) {
            System.out.print(l2+" ");
        }

    }
}
