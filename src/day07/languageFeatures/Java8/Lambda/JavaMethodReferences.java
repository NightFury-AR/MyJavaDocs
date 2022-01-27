package day07.languageFeatures.Java8.Lambda;

interface MethodRef {
    public void methodRef();
}

interface ConstructorMethodRef {
    public void start(String name);
}

public class JavaMethodReferences {
    public JavaMethodReferences(){}

    public JavaMethodReferences(String msg){
        System.out.println(msg+" Method Reference");
    }

    public static void MethodRef() {
        System.out.println("I'm static Method Ref.");
    }

    public void InsMethodRef() {
        System.out.println("I'm Instance Method Ref.");
    }



    public static void main(String[] args) {

        //01-Static Method Ref
        MethodRef sMR = JavaMethodReferences::MethodRef;
        sMR.methodRef();

        //02.Instance Method Ref
        JavaMethodReferences j = new JavaMethodReferences();
        MethodRef iMR = j::InsMethodRef;
        iMR.methodRef();

        //03.Constructor Method Ref
        ConstructorMethodRef cMR = JavaMethodReferences::new;
        cMR.start("Constructor");


    }
}
