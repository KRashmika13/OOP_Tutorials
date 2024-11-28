package week04.exercise2;

public class Student extends Person {
    private int IDNumber;
    private double fees;
    private int grade;
    static int tot = 0;

    public Student(int IDNumber, String myName, int myAge, String myGender){
        super(myName,myAge,myGender);
        this.IDNumber = IDNumber;
        tot++;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String toString(){
        return "Student: sub class of " + super.toString()
                + ", ID Number = " + getIDNumber()
                + ", Fee = " + getFees()
                + ", Grade = " + getGrade();
    }
}
