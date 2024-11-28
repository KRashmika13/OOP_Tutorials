package week03;
import java.lang.IllegalArgumentException;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day < 1 || day > 31){
            throw new IllegalArgumentException("Invalid day");
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12){
            throw new IllegalArgumentException("Invalid month");
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 1980 || year > 2072){
            throw new IllegalArgumentException("Invalid year");
        }
        this.year = year;
    }

    public void setDate(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public String getDate(){
        return String.format("%02d/%02d/%02d", day, month, year);
    }

    public String toString(){
        return "Date[day = " + day + ", month = " + month + ", year = " + year + "]";
    }
}
