package day03.JavaNumbersAndStrings;

public class JavaCharacters {
    public static void main(String[] args) {
        char c = 'A';
        Character chObj = new Character(c);
        System.out.println(" is Char : "+Character.isLetter(c));
        System.out.println(" is Digit : "+Character.isDigit(c));
        System.out.println(" is lowercase : "+Character.isLowerCase(c));
        System.out.println(" is uppercase : "+Character.isUpperCase(c));
        System.out.println(" is whitespace : "+Character.isWhitespace(c));
        System.out.println(" is lowercase : "+Character.toLowerCase(c));
        System.out.println(" is uppercase : "+Character.toUpperCase(c));
    }
}
