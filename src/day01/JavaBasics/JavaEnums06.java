package day01.JavaBasics;
//1.defining enum
//2.defining abstract method
//3.override the abstract methods for all enum

public class JavaEnums06 {
    //1.defining enum
    public enum LevelWithAbstract {
        //3.override the abstract methods for all enum
        CONQUEROR{
            @Override
            public String getRewards() {
                return "Conqueror clothing set, premium guns,cars";
            }
        },
        ACE {
            @Override
            public String getRewards() {
                return "Ace clothing set, premium guns";
            }
        },
        ROOKIE {
            @Override
            public String getRewards() {
                return "Ordinary clothing set, normal guns";
            }
        },
        NOOB() {
            @Override
            public String getRewards() {
                return "Ordinary hat";
            }
        };
        //2.defining abstract methods
        public abstract String getRewards();
    }

    public static void main(String args[]) {
        System.out.println("Getting Rewards based on player Level");
        System.out.println(LevelWithAbstract.CONQUEROR + " got "+LevelWithAbstract.CONQUEROR.getRewards());
        System.out.println(LevelWithAbstract.ACE + " got "+LevelWithAbstract.ACE.getRewards());
        System.out.println(LevelWithAbstract.ROOKIE + " got "+LevelWithAbstract.ROOKIE.getRewards());
        System.out.println(LevelWithAbstract.NOOB + " got "+LevelWithAbstract.NOOB.getRewards());
    }
}

