package day07.languageFeatures.Java8.FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java006StreamsAdvanced {

    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student("12","12",Arrays.asList("Hello","Hi")),
        new Student("12","12",null)
        );

        List<Student> collect = list.stream().filter(student -> student.getList().isEmpty()).collect(Collectors.toList());
        System.out.println(collect);


    }
    static class Student {
        private String studentId;
        private String name;
        private List<String> list;

        public Student(String studentId, String name, List<String> list) {
            this.studentId = studentId;
            this.name = name;
            this.list = list;
        }

        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getList() {
            return list;
        }

        public void setList(List<String> list) {
            this.list = list;
        }
    }
}
