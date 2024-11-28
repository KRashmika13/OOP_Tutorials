package week04.exercise2;

public class Main {
    public static void main(String[] args){
        Person person1 = new Person("Kavindi", 23, "F");
        System.out.println(person1);

        Student student1 = new Student(20230487, "Kavindi", 23, "F");
        System.out.println(student1);

        Teacher teacher1 = new Teacher("Sam Hamilton", 34, "M", "Computer Science", 50000);
        System.out.println(teacher1);

        Teacher teacher2 = new Teacher("rashmi", 40, "F", "Maths", 40000);
        System.out.println(teacher2);

        System.out.println("person = " + Person.count);
        System.out.println("Teachers = " + Teacher.tot);
        System.out.println("Student = " + Student.tot);
    }
}
