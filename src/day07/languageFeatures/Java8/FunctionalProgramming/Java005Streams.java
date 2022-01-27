package day07.languageFeatures.Java8.FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java005Streams {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>(Arrays.asList(
                new User("TONY","US",gender.MALE),
                new User("CAPTAIN","USA",gender.MALE),
                new User("WANDA","UK",gender.FEMALE),
                new User("BLACKWIDOW","US",gender.FEMALE)
        ));

        //printing all names
        userList.stream().map(user -> user.userName).forEach(System.out::println);

        //printing genders
        userList.stream().map(user -> user.userGender).collect(Collectors.toSet()).forEach(System.out::println);

        //printing name lengths
        userList.stream().map(user -> user.userName).mapToInt(String::length).forEach(System.out::println);

        //matching
        boolean isOnlyFemales = userList.stream().allMatch(user -> user.userGender.equals(gender.FEMALE));
        boolean isAnyFemales = userList.stream().anyMatch(user -> user.userGender.equals(gender.FEMALE));
        boolean isNoOtherGenders = userList.stream().noneMatch(user -> user.userGender.equals(gender.OTHER));
        System.out.println(" Is only Females : "+isAnyFemales+" \n Is Any Females : "+isAnyFemales+" \n Is only male , female : "+isNoOtherGenders);

    }

    static class User {
        private String userName;
        private String country;
        private gender userGender;
        public User(String name,String country,gender userGender) {
            this.country=country;
            this.userName=name;
            this.userGender=userGender;
        }
    }

    enum gender {
        MALE,FEMALE,OTHER
    }
}
