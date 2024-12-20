package week04.exercise2;

public class Teacher extends Person{
    private double salary;
    private String subject;
    static String dep = "Science";
    static int tot = 0;

    public Teacher(String myName, int myAge, String myGender, String subject, double salary){
        super(myName, myAge, myGender);
        this.salary = salary;
        this.subject = subject;
        this.dep = dep;
        tot++;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(){
        return "Techer: " + super.toString()
                + ", Subject = " + getSubject()
                + ", Salary = " + getSalary()
                + ", dep = " + dep;
    }
}
