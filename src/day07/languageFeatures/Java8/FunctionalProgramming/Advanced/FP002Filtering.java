package day07.languageFeatures.Java8.FunctionalProgramming.Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FP002Filtering {

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

        //1.filter
        Predicate<StudentBean> ratingMoreThan3 = student -> student.getPlayerRating() > 3;
        Predicate<StudentBean> gradeC = student -> student.getStudentGrade().equals("C");
        List<StudentBean> cGradeStudentsWithAboveRating3 = studentData.stream().filter(ratingMoreThan3).filter(gradeC).collect(Collectors.toList());
        System.out.println("1.Filter");
        System.out.println(" Students with rating:3 grade:c => "+cGradeStudentsWithAboveRating3);

        //2.filter using drop while
        //3.filter using take while
        // both are from Java 9 - will come back later here
        //
        //4.find first
        StudentBean findTheFirstStudentWithRating5 = studentData.stream()
                .filter(studentBean -> studentBean.getPlayerRating()==5)
                .findFirst().get();
        System.out.println();
        System.out.println("4.using find first \n"+findTheFirstStudentWithRating5);

        //5.find Any
        StudentBean findAnyStudentWithRating5 = studentData.stream()
                .filter(studentBean -> studentBean.getPlayerRating()==5)
                .findAny().get();
        System.out.println();
        System.out.println("5.using find any \n"+findTheFirstStudentWithRating5);

        //6.all match
        Boolean allTheStudentsHaveRatingMoreThan1 = studentData.stream()
                        .allMatch(student -> student.getPlayerRating()>3);
        System.out.println();
        System.out.println("5.using all match \n"+allTheStudentsHaveRatingMoreThan1);

        //6.any match
        Boolean anyOneStudentHaveRatingMoreThan1 = studentData.stream()
                .anyMatch(student -> student.getPlayerRating()>=3);
        System.out.println();
        System.out.println("6.using any match \n"+anyOneStudentHaveRatingMoreThan1);
    }

}
