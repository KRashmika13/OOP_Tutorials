package week02.person;

import week02.person.Person;

public class TutorialWeek02 {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println();

        Person p1 = new Person("Kavindi", "Rashmika", 23);
        System.out.println("Person 01");
        p1.displayName();
        p1.getSurname();
        p1.getAge();
        System.out.println();

        Person p2 = new Person("Buddhini", "Thathsarani", 23);
        System.out.println("Person 02");
        p2.displayName();
        p2.getSurname();
        p2.getAge();
        System.out.println();

        Person p3 = new Person("Sayuri", "Pathiraja", 23);
        System.out.println("Person 03");
        p3.displayName();
        p3.getSurname();
        p3.getAge();
        System.out.println();

        System.out.println("Total number of person = " + Person.getNumberOfPepole());
    }
}
