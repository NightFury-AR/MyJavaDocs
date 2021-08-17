<span style="color:orange">**Java Class**</span>
- class is a blueprint of the object.
- it will tell us how object will looks like , what are all the functionalities it should have.

for e.g if we say TV , then it should have screen, speakers , audio, video functionalities.these are the common features of TV irrespective of advanced or basic TV.

now compare this with our object,
- screen,speakers are state or properties of the TV class.
- playing audio,changing channel, volume adjustment are all its behavior or members of the TV class.

<span style="color:red;background-color:white;padding:5px;">**e.g., without speaker you can't adjust TV volume, like same without screen you can't change the settings/channel.**</span>  

see the <span style="color:green">**JavaClass01**</span> file to know how classes created in java.

![Captureclass](https://user-images.githubusercontent.com/72085278/129470019-06c2a3be-e1db-4486-bb1f-83bb74a86672.JPG)



<span style="color:orange">**Java Objects**</span>

- objects are the actual working creature/thing/😈👽👻😼🐱‍🚀.
- if class is a blueprint , then object is the final model.

for example, if Sonie company wants to manufacture the new TV, then they should have create the skeleton first. then create a actual working TV.

like same all companies did.

see the <span style="color:green">**JavaObject02**</span> file to know how objects created in java.

![ClassAndObject](https://user-images.githubusercontent.com/72085278/129469989-670c3970-bd3a-42b7-afc4-eb203e748621.JPG)


<span style="color:orange">Constructor</span>

whenever we create a new object. then JVM will automatically call the class's constructor method;

- we can override the default constructor.
- we can use parameterized constructor as well

e.g., whenever we say TV sonieTV = new TV(); , JVM will check any constructor implemented. if yes it will execute that block. otherwise , it will create default constructor.

**this** keyword

instead of definition will see the example.

```//constructor
class A {
private int number;
public classA(int number) {
    number = number //JVM🤔 you are referring which 'number' ?
    }
}
```

in the above example, JVM gets confused which variable use, because both param of the constructor and class member variable are same name "number".

so we will use "this" to overcome this problem.

```//constructor
class A {
private int number;
public classA(int number) {
    this.number = number //this means => A.number 
    }
}
```

