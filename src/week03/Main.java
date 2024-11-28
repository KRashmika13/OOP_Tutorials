package week03;
import java.lang.IllegalArgumentException;

public class Main {
    public static void main(String[] args){

        Director dir1 = new Director("James", "Cameron");
        dir1.numOfFilmDirected = 3;

        Date date1 = new Date(36, 8, 1954);
        date1.setDate(36, 8, 1954);
        dir1.setDateOfBirth(date1);
        System.out.println(dir1);
        System.out.println("Name is: " + dir1.getDName());
        System.out.println("Surname is: " + dir1.getDSurname());
        System.out.println("Date of birthday: " + date1.getDate());
        System.out.println("Number of movie directed: " + dir1.getNumOfFilmDirected());
        System.out.println();

        Movie movie1 = new Movie("Avatar", "Fantasy", dir1);
        System.out.println(movie1);

        movie1.setNumOfAwards(23);

        System.out.println(movie1);
        System.out.println("title is: " + movie1.getTitle());
        System.out.println("category is: " + movie1.getCategory());
        System.out.println("name of director: " + dir1.getDName());
        System.out.println("surname of director: " + dir1.getDSurname());
        System.out.println("number of awards is: " + movie1.getNumOfAwards());
    }
}
