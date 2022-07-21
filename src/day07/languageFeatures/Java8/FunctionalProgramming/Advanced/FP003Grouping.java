package day07.languageFeatures.Java8.FunctionalProgramming.Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FP003Grouping {
    public static void main(String[] args) {
        //mock data
        List<StudentBean> studentData = Arrays.asList(
                new StudentBean(001,"aashiq","A","UDT","Captain",5),
                new StudentBean(002,"augusta","A","PLC","Vice Captain",3),
                new StudentBean(003,"Jane","B","PLC","Player",3),
                new StudentBean(004,"rahma","B","UDT","Player",5),
                new StudentBean(005,"riya","C","UDT","substitude",4),
                new StudentBean(006,"Rane","C","PLC","substitude",2)
        );

        //1. simple group by
        Map<String, List<StudentBean>> map = studentData.stream()
                .collect(Collectors.groupingBy(StudentBean::getStudentGrade));

        map.forEach( (grade , sData) -> {
            System.out.println(" Grade : "+grade);
            sData.forEach(System.out::println);
        });

        //2. grouping and counting
        // count the number of chars in string
        List<String> nameList = studentData.stream().map( student -> student.getStudentName()).collect(Collectors.toList());
        Map<String, Long> map1 = nameList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map1);

        //3.count the characters in string
        String word = "AVENGER";
        Map<String, Long> charCount = word.chars().mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //4.joining strings
        List<String> names = Arrays.asList("anna", "john", "marcos", "helena", "yasmin");
        // "Anna, John, Marcos, Helena, Yasmin"
        String join = names.stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .collect(Collectors.joining("|"));
        System.out.println(join);

    }
}
