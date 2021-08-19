package day03.JavaNumbersAndStrings;

public class JavaStringMethods {
    // here only string methods which are having only one form is discussed.
    // many form string methods like substring,split,startswith will be discussed in next example

    public static void main(String[] args) {
        String str = "Hello !";
        String str2 = " Universe";
        System.out.println(" str = Hello ! , str2=Universe");

        System.out.println();
        System.out.println("1.String Char codepoint methods");
        System.out.println("-------------------------------");
        System.out.println(" str.ChatAt(0) : "+str.charAt(0));
        System.out.println(" str.codePointAt(2) => code point of l: "+str.codePointAt(2));
        System.out.println(" char of code 108 is -> : "+Character.toChars(108)[0]);
        System.out.println(" str.codePointBefore(2) => code point b4 l. means e's code point : "+str.codePointBefore(2));
        System.out.println(" char of code 101 is -> : "+Character.toChars(101)[0]);
        System.out.println(" str.codePointCount(1,4) : "+str.codePointCount(1,4));

        System.out.println();
        str = "Hello"; str2 = "Hell";
        System.out.println("2.String comparison");
        System.out.println("-------------------");
        System.out.println(" str = \"Hello\"; str2 = \"Hell\";");
        System.out.println(" returns 0 if both are equal else positive number >0");
        System.out.println(" str.compareTo(str2) : "+str.compareTo(str2));
        System.out.println(" str.compareToIgnoreCase(str2) : "+str.compareToIgnoreCase(str2));


        System.out.println();
        System.out.println("3..String checks");
        System.out.println("----------------");
        str = "Hello !";
        str2 = " Universe";
        String conc = str.concat(str2);
        System.out.println(" str.isEmpty() : "+str.isEmpty());
        System.out.println(" str.length() : "+str.length());
        System.out.println(" str.concat(str2) : "+conc);
        System.out.println(" str.contains(\"e\") : "+str.contains("e"));
        System.out.println(" str.endsWith(\"!\") : "+str.endsWith("!"));
        System.out.println(" str.equalsIgnoreCase(str2) : "+str.equalsIgnoreCase(str2));
        System.out.println(" str.trim() : "+str.trim());
        System.out.println(" str.subSequence(0,2) : "+str.subSequence(0,2));
        System.out.println(" str.toCharArray()//['H','e','l','l','o'] : "+str.toCharArray());

        System.out.println("\nbelow methods will be discussed later.");
        System.out.println(" contentEquals() ,copyValueOf() ,getBytes() \n" +
                " getChars() ,indexOf() ,intern() ,matches(regex) ,offsetByCodePoints() \n" +
                " regionMatches() ,replace() ,replaceFirst() ,replaceAll() ,split() \n" +
                " startsWith ,subString() ,toLowerCase() ,toUpperCase() ,valueOf()\n");
    }
}
