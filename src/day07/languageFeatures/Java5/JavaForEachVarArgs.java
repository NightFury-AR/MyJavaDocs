package day07.languageFeatures.Java5;

public class JavaForEachVarArgs {
    public static void multiArguments(String... seriesOfInputs){
        for (String s :seriesOfInputs) {
            System.out.println(" input is "+s);
        }
    }
    public static void main(String[] args) {
        multiArguments("Hai","Hello","how are you ?","what's up boys");
    }
}
