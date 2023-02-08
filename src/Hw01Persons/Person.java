package Hw01Persons;
public class Person {

    String name;
    int age;
    String city;
    String gender;


    static void talk(String setName) {

        System.out.println("My name is " + setName + ".");
    }

    String setName(String name) {
        return name;
    }

    int setAge(int age) {
        return age;
    }

    String setCity(String city) {
        return city;
    }

    String setGender(String gender) {
        return gender;
    }

}