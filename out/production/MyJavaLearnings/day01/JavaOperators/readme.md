<span style="color:orange;padding:5px">**Operators in Java**</span>

- Arithmetic Operator
- Relational Operator
- Short Circuit operator
- Bitwise Operator
- Ternary Operator

**1.Arithmetic Operator**

| Name      | symbol |  expression |
|-----------|:-----------:|:-----------:|
| addition  | <span style="color:yellow">**" + "**</span> |  a + b |
| subtraction | <span style="color:yellow">**" - "**</span> |  a - b |
| multiplication | <span style="color:yellow">**" * "**</span> | a * b |
| division | <span style="color:yellow">**" / "**</span> | a/b |
| modulus | <span style="color:yellow">**" % "**</span> | a%b |
| decrement | <span style="color:yellow">**" -- "**</span> | a--,b-- |
| increment | <span style="color:yellow">**" ++ "**</span> | a++,b++ |
| addition assignment | <span style="color:yellow">**" += "**</span>  | a += b  |
| subtraction assignment | <span style="color:yellow">**" -= "**</span> | a -= b |
| multiplication assignment | <span style="color:yellow">**" *= "**</span> | a *= b |
| division assignment | <span style="color:yellow">**" /= "**</span> | a/=b |
| modulus assignment | <span style="color:yellow">**" %= "**</span> | a%=b |

**2.Bitwise Operators**  
here a=1, b=0,

| Name      | symbol |  expression | Result |
|-----------|:-----------:|:-----------:|:-----------:|  
| Bitwise AND |&| a & b | 0 |
| Bitwise OR | &#1472; | a &#1472; b | 1 |
| Bitwise exclusive OR |^| a ^ b | 1 |
| Shift Left | << | a << b | |
| Shift Right| &#62;&#62; | a >> b | |
| Bitwise unary not |~| ~a | 1 |
| Bitwise AND Assignments |&=| a &= b | a=0 |
| Bitwise OR Assignments| &#1472; = | a &#1472;= b | a=1|
| Bitwise exclusive OR Assignments|^=| a ^= b | a=1 |
| Shift Left Assignment|<<| a << b |
| Shift Right Assignment|&#62;&#62;| a >> b |

**bitwise truth table**

| a | b | a&b | a &#1472; b | a ^ b | ~a |  
|-----------|:-----------:|:-----------:|:-----------:|:-----------:|:-----------:|  
|1|0|0|1|1|0|
|0|1|0|1|1|1|
|0|0|0|0|0|1|
|1|1|1|1|0|0|  

**Right Shift: 20>>2 = 5**

- Binary value of 20 is: 00000000000000000000000000010100
- shift bits 2 positions to right: 00000000000000000000000000000101
- Result is: 1*2^2 + 0*2^1 + 1*2^0 = 5
- or 20/(2power2) => 20/(2*2) => 20/(4) => 5


**Left Shift: 13<<2=52**

- Binary value of 13 is: 00000000000000000000000000001101
- shift bits 2 positions to left and fill right bits with 0's: 00000000000000000000000000110100
- Result is: 1*2^5+1*2^4+0*2^3+1*2^2+0*2^1+0*2^0 = 52
- or 13*(2power2) => 13*(2*2) => 13*(4) => 52


**3.Relational Operator**

If a = 10 and b = 20, the result of each operation is mentioned in the Result column.

| Operator	| Operation	 | Expression	| Result |
|-----------|:-----------:|:-----------:|:-----------:|  
|<|Less than|a < b|true|
|&#62;|Greater than	| a > b |	false|
|<=|Less than or equal to|a<=b|	true |
|&#62;=|Greater than or equal to |	a >= b	| false |
|== |Equal to |	a==b | false |
| != |Not equal to | a!=b | true |

**4.Ternary Operator**

- Syntax: result = (test_condition) ? (value_1) : (value_2)
- e.g., result = a > b ? "a is big " : "b is big";

**5.Logical Operator**

| Operator	| Operation	 | Expression	| Result |
|-----------|:-----------:|:-----------:|:-----------:|  
|&#1472;&#1472;|Short Circuit OR|	a &#1472;&#1472; b | true |
|&&|	Short Circuit AND|	a&&b|	false|
|!|NOT|	!a	|false| 
