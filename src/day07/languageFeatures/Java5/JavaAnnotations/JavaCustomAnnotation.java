package day07.languageFeatures.Java5.JavaAnnotations;

import java.lang.annotation.*;

//we can specify for our custom annotation if it should be available at runtime
@Retention(RetentionPolicy.RUNTIME)

@Target(ElementType.TYPE)
@interface MyAnnotation {
    String name();
    String id();
}


@MyAnnotation(name = "hey",id = "007")
public class JavaCustomAnnotation {

}
