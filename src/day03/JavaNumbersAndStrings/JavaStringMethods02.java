package day03.JavaNumbersAndStrings;

import java.awt.*;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class JavaStringMethods02 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "Hai !";
        String t = "Hello";
        String s_2 = "Hai!";

        //contentEquals
        System.out.println("contentEquals Method(2)");
        System.out.println(" 1.using charSequence as param : "+s.contentEquals(s_2));
        System.out.println(" 2.using StringBuffer as param : "+s.contentEquals(s_2));

        //copyValueOf
        char[] c = {'H','e','y','!',' ','M','a','n'};
        System.out.println("\ncopyValueOf Method(2)");
        System.out.println(" 1.using char array as param : "+String.copyValueOf(c));
        System.out.println(" 2.using charArray,offset,count as param : "+String.copyValueOf(c,5,2));

        //getBytes()
        System.out.println("\ngetBytes() Method(4)");
        System.out.println(" 1.using without param : "+ Arrays.toString(s.getBytes()));
        System.out.println(" 2.using with StandardCharsets param : "+ Arrays.toString(s.getBytes(StandardCharsets.UTF_8)));
        System.out.println(" 3.using with charsets as string param : "+ Arrays.toString(s.getBytes("UTF8"))+" //UnsupportedEncodingException is required");
        Charset utf = Charset.forName("UTF8");
        System.out.println(" 4.using with charset object as param : "+ Arrays.toString(s.getBytes(utf)));

        //getChars
        System.out.println("\ngetChars() Method(1)");
        char[] ch = new char[10];
        //getChars(srcBegin,srcEnd,wheretoStore(char[]),destBegin);
        s.getChars(0,3,ch,0);
        System.out.println(" 1.using with params : "+Arrays.toString(ch));

        //indexOf
        System.out.println("\nindexOf() Method(4)");
        System.out.println("returns -1 if not found");
        System.out.println(" 1.using with char as param "+s.indexOf('H'));
        System.out.println(" 2.using with string as param "+s.indexOf("H"));
        System.out.println(" 3.using with char,from index as params "+s.indexOf('H',2));
        System.out.println(" 4.using with string,from index as params "+s.indexOf("H",2));

        //intern
        String str = new String("hello there");
        String str2 = "hello there";
        System.out.println("\nintern() Method(1)");
        System.out.println(" str is same as str2(str==str2) = "+(str==str2));
        str = str.intern();
        System.out.println(" after str=str.intern(), str==str2 = "+(str==str2));

        //matches
        //will see advanced regex later
        System.out.println("\nmatches() Method(1)");
        System.out.println(" 1.checking string format with the help of regex pattern"+str.matches("[A-Za-z]"));

        //offsetByCodePoints()
        System.out.println("\noffsetByCodePoints() Method(1)");
        System.out.println(" 1."+s.offsetByCodePoints(2,3));

        //regionMatches()
        //used to match specific region from string
        System.out.println("\nregionMatches() Method(2)");
        String w = "how are you";
        String w_1 = "how";
        System.out.println(" 1.using tooffset,string,fromoffset,len as a params :"+w.regionMatches(0,w_1,0,2));
        System.out.println(" 2.using ignorecase,tooffset,string,fromoffset,len as a params :"+w.regionMatches(false,0,w_1,0,2));

        //replace
        System.out.println("\nreplace() Method(2)");
        System.out.println(" 1.using oldchar , newchar as params :"+s.replace('H','A'));
        System.out.println(" 2.using oldString , newString as params :"+s.replace("Aa","Ha"));

        //replaceFirst
        System.out.println("\nreplaceFirst() Method(1)");
        System.out.println(" 1.using regex , newString as params :"+s.replaceFirst("[A-Z]","2"));

        //replaceAll
        System.out.println("\nreplaceAll() Method(2)");
        System.out.println(" 1.using regex , newString as params :"+s.replaceAll("[A-Za-z]","Hello"));

        //split
        System.out.println("\nsplit() Method(2)");
        s = "Hai ! hai ! ";
        System.out.println(" 1.using regex string as param : "+Arrays.toString(s.split(" ")));
        System.out.println(" 2.using regex string , limit as params : "+Arrays.toString(s.split(" ",3)));

        //startsWith
        System.out.println("\nstartsWith Method(2)");
        System.out.println(" 1.using prefix as param : "+s.startsWith("H"));
        System.out.println(" 2.using prefix,offset as param : "+s.startsWith("H",2));

        //subString
        System.out.println("\nsubString Method(2)");
        System.out.println(" 1.using beginIndex as param : "+s.substring(1));
        System.out.println(" 2.using beginIndex,end Index as param : "+s.substring(0,4));

        //toLowerCase
        System.out.println("\ntoLowerCase Method(3)");
        System.out.println(" 1.using without param : "+s.toLowerCase());
        System.out.println(" 2.using locale as param : "+s.toLowerCase(Locale.ROOT));
        //System.out.println(" 3.using locale object as param : "+s.toLowerCase(Locale locale));

        //toUpperCase
        System.out.println("\ntoUpperCase Method(3)");
        System.out.println(" 1.using without param : "+s.toUpperCase());
        System.out.println(" 2.using locale as param : "+s.toUpperCase(Locale.ROOT));
        //System.out.println(" 3.using locale object as param : "+s.toUpperCase(Locale locale));


        //valueOf()
        String s1 = String.valueOf(10);//we can pass int,float,short.....etc.,
        System.out.println("\nvalueOf Method()");
        System.out.println(" we can pass int,float,short.....etc., using int : "+s1);

    }
}


