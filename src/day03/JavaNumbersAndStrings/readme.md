##<span style="color:orange">Numbers and Strings</span>
****

<span style="color:orange">**Numbers**</span>

![Number](https://user-images.githubusercontent.com/72085278/129882479-adef7e11-683f-4f3d-b828-9c2bd2ebf768.JPG)

see examples for most used methods in Number's subclasses.

**Numeric Print Output**

```java
int i =10;
System.out.format("its a number %d",i);
```

|Converter|Flag|Explanation|
|:-------:|:---:|:---------:|
|d	| 	|A decimal integer.|
|f	| 	|A float.|
|n	| 	|A new line character appropriate to the platform running the application. You should always use %n, rather than \n.|
|tB	|	|A date & time conversion—locale-specific full name of month.|
|td,te | |	 	A date & time conversion—2-digit day of month. td has leading zeroes as needed, te does not.|
|ty,| |tY	 	A date & time conversion—ty = 2-digit year, tY = 4-digit year.|
|tl	 | |	A date & time conversion—hour in 12-hour clock.|
|tM	 | |	A date & time conversion—minutes in 2 digits, with leading zeroes as necessary.|
|tp	 | |	A date & time conversion—locale-specific am/pm (lower case).|
|tm	 | |	A date & time conversion—months in 2 digits, with leading zeroes as necessary.|
|tD	 | |	A date & time conversion—date as %tm%td%ty|
| |08|	Eight characters in width, with leading zeroes as necessary.|
| |+	|Includes sign, whether positive or negative.|
| |,	|Includes locale-specific grouping characters.|
| |-	|Left-justified..|
| |.3|	Three places after decimal point.|
| |10.3|	Ten characters in width, right justified, with three places after decimal point.|


**Character**

Used to represent a single character.

```java
Character c = new Character('A');
Character.isDigit(c) // like this , we have some set of useful methods.
```

**String**

unlike other data types, strings referred as objects in java.

```java
char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
String helloString = new String(helloArray);
System.out.println(helloString);
```
The last line of this code snippet displays hello.

>Note : The String class is immutable, so that once it is created a String object cannot be changed. 

To use string with mutable , we can use StringBuffer or StringBuilder.

difference between StringBuilder and StringBuffer.

|StringBuffer|StringBuilder|
|:----------:|:-----------:|
|Thread Safe| Not Thread Safe|
|Synchronized | Not Synchronized |
|since Java 1.0 | since Java 1.5|
|Slower | Faster|

see examples for StringBuffer and StringBuilder Methods.

**AutoBoxing and UnBoxing**

```java

Integer i = new Integer(4);
//unBoxing
int i_1 = i;

int j = 10;
//autoBoxing
Integer j_1 = j;

```
