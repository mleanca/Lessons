package Hw01Persons;
public class Main {
    public static void main(String[] args) {

        Person john = new Person();
        john.setName("John");
        john.setAge(35);
        john.setCity("Delhi");
        john.setGender("male");

        Person.talk("John");

        Person dessy = new Person();
        dessy.setName("Dessy");

        Person.talk("Dessy");

    }
}
