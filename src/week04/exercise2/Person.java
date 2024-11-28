package week04.exercise2;

public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;
    static int count = 0;

    public Person(String myName, int myAge, String myGender){
        this.myName = myName;
        this.myAge = myAge;
        this.myGender = myGender;
        count++;
    }

    public String getMyName(){
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getMyGender() {
        return myGender;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }

    public String toString(){
        return "Name = " + myName + ", Age = " + myAge + ", Gender = " + myGender;
    }
}
