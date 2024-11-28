package week03;

public class Director {
    String dName;
    String dSurname;
    int numOfFilmDirected;
    Date dateOfBirth;

    public Director(String dName, String dSurname){
        this.dName = dName;
        this.dSurname = dSurname;
    }

    public String getDName() {
        return dName;
    }

    public String getDSurname() {
        return dSurname;
    }

    public int getNumOfFilmDirected() {
        return numOfFilmDirected;
    }

    public void setNumOfFilmDirected(int numOfFilmDirected) {
        this.numOfFilmDirected = numOfFilmDirected;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString(){
        return "Director[name = " + dName + ", surname = " + dSurname + ", number of movies = " + numOfFilmDirected + ", birthday = " + dateOfBirth.getDate() + "]";
    }
}
