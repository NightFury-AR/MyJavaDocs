**Java Encapsulation**

Java provides two levels of encapsulations.

1.class/interface level  
2.member/variable level

both are accomplished by using access modifiers.

they are,

- public
- private
- protected
- default

| Keyword	| ApplicableTO	 | who can access	|
|-----------|:-----------:|:-----------:|
|<span style="color:orange;">private</span>|innerclass, methods,data members| All Members from same class only |
|<span style="color:orange;">default</span> (no need to specify)|Data members, methods, classes, and interfaces| All class from within same package |
|<span style="color:orange;">protected</span>|Data members, methods, and inner class| All classes from within the same package as well as all subclasses i.e. even subclasses residing in a different package |
|<span style="color:orange;">public</span>|Data members, methods, classes, and interfaces| Any class |



