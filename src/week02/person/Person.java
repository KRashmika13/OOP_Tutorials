package week02.person;

public class Person {
    private final String name;
    private String surname;
    private int age;

    private static int numberOfPepole;

    public Person(String n){
        name = n;
    }

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;

        numberOfPepole++;
    }

    public void displayName(){
        System.out.println("Name: " + name);
    }

    public void getSurname() {
        System.out.println("Surname:" + surname);
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void getAge() {
        System.out.println("Age: " + age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getNumberOfPepole(){
        return numberOfPepole;
    }
}
