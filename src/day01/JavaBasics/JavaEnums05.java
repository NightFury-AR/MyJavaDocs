package day01.JavaBasics;

//1.defining enum with fields and methods
//2.enum field using constructor
//3.enum method declaration
//4.calling enum method

public class JavaEnums05 {

    //1.defining enum with fields and methods
    public enum LevelWithField {
        CONQUEROR(1),ACE(5),ROOKIE(50),NOOB(100);
        private int noOfPositions;
        //2.enum field using constructor
        LevelWithField (int number) {
            this.noOfPositions = number;
        }

        //3.enum method declaration
        public int getNoOfPositions() {
            return this.noOfPositions;
        }
    }

    public static void main(String args[]) {
        //4.calling enum method
        System.out.println("Calling Enum Method : "+LevelWithField.ACE.getNoOfPositions());
    }
}
