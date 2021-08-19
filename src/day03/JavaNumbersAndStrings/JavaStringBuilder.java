package day03.JavaNumbersAndStrings;

import java.util.Arrays;

public class JavaStringBuilder {
    public static void main(String[] args) {

        //1.string builder with empty string
        StringBuilder sb_1 = new StringBuilder();

        //2.string builder with string
        StringBuilder sb_2 = new StringBuilder("Hai..");

        //3.string builder with string length
        StringBuilder sb_3 = new StringBuilder(20);

        //capacity
        System.out.println(" Empty string builder capacity -> " + sb_1.capacity());
        System.out.println(" with data string builder capacity -> " + sb_2.capacity());
        System.out.println(" with capacity string builder capacity -> " + sb_3.capacity());

        //length
        System.out.println(" Empty string builder length -> " + sb_1.length());
        System.out.println(" with data string builder length -> " + sb_2.length());
        System.out.println(" with capacity string builder length -> " + sb_3.length());

        //append (3 types)
        System.out.println(" 1.append(primitive data type) -> "+sb_1.append(10));
        char[] ch = {' ','h','e','l','l','o'};
        System.out.println(" 2.append(char[] , offset ,length, -> "+sb_1.append(ch,0,6));
        CharSequence cS = "boy !";
        System.out.println(" 3.append(charSequence, start ,end) -> "+sb_1.append(cS,0,3));
        System.out.println(" 4.append(String buffer) ");

        //appendCodePoint()
        System.out.println(" appendCodePoint(codepoint) -> "+sb_1.appendCodePoint(108));

        //chatAt
        System.out.println(" charAt(index) -> "+sb_1.charAt(3));

        //chars()// return int stream
        System.out.println(" chars() -> "+sb_1.chars());

        //codePointAt(int index)
        System.out.println(" codePointAt(index) -> "+sb_1.codePointAt(3));

        //codePointBefore(int index)
        System.out.println(" codePointBefore(index -> "+sb_1.codePointBefore(4));

        //codePointCount(int beginIndex, int endIndex)
        System.out.println(" codePointCount(begin,end) -> "+sb_1.codePointCount(2,5));

        //IntStream codePoints() //returns int stream
        System.out.println(" codePoints() -> "+sb_1.codePoints());

        //StringBuilder delete(int start, int end)
        System.out.println(" delete(start,end) -> "+sb_1.delete(0,1));

        //StringBuilder deleteCharAt(int index)
        System.out.println(" deleteCharAt(index) -> "+sb_1.deleteCharAt(sb_1.length()-1));

        //ensureCapacity(int minimumCapacity)
        sb_2.ensureCapacity(30);
        System.out.println(" ensureCapacity(30) to sb_2 -> "+sb_2.capacity());

        //getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        char ch1[] = new char[6];
        sb_1.getChars(0,5,ch1,0);
        System.out.println(" getChars(begin,end,data,destbegin) -> "+ Arrays.toString(ch1));

        //indexOf()
        System.out.println(" 1.indexOf(char) -> "+sb_1.indexOf("e"));
        System.out.println(" 2.indexOf(char, from) -> "+sb_1.indexOf("e",2));


        //StringBuilder insert(int offset, data type)
        System.out.println(" 1.insert(offset,data type) -> "+sb_1.insert(sb_1.length(),true));
        System.out.println(" 2.insert (indexofsb,srcchar,srcoffset,len) -> "+sb_1.insert(sb_1.length(),ch1,0,4));
        System.out.println(" 3.insert (offsetofsb,chSeq,star,end) -> "+sb_1.insert(sb_1.length(),"zzz",0,3));

        //lastIndexOf()
        System.out.println(" 1.LastindexOf(string) -> "+sb_1.lastIndexOf("z"));
        System.out.println(" 2.LastindexOf(string,from) -> "+sb_1.lastIndexOf("z",sb_1.length()-3));

        //offsetByCodePoints(int index, int codePointOffset)
        System.out.println(" offsetByCodePoints(index, codepoint) ->"+sb_1.offsetByCodePoints(10,2));

        //StringBuilder replace(int start, int end, String str)
        System.out.println(" replace(start,end,string) -> "+sb_1.replace(0,sb_1.length(),"hai"));

        //StringBuilder reverse()
        System.out.println(" reverse -> "+sb_1.reverse());

        //setCharAt(int index, char ch)
        sb_1.setCharAt(2,'E');
        System.out.println(" setCharAt(index,char) -> "+sb_1);

        //setLength(int newLength)
        sb_1.setLength(5);
        sb_1.setCharAt(4,'A');
        System.out.println(" setlength(int) -> "+sb_1.length()+ " -> "+sb_1);

        //CharSequence subSequence(int start, int end)
        System.out.println(" subsequence(start,end) -> "+sb_1.subSequence(0,3));

        //String substring()
        System.out.println(" 1.substring(start) -> "+sb_1.substring(2));
        System.out.println(" 2.substring() -> "+sb_1.substring(0,3));

        //String toString()
        System.out.println(" toString() -> "+sb_1.toString());

        //void trimToSize()
        sb_1.append("     ");
        System.out.println(" trimtoSize -> "+sb_1.length()+" "+sb_1);
        sb_1.trimToSize();
        System.out.println(" trimtoSize -> "+sb_1.length()+" "+sb_1);

    }
}
