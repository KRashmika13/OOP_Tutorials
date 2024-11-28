package week03;

public class Movie {
    private String title;
    private String category;
    private int numOfAwards;
    private Director director;

    public Movie(String title, String category, Director director){
        this.title = title;
        this.category = category;
        this.director = director;
    }

    public String getTitle(){
        return title;
    }

    public String getCategory(){
        return category;
    }

    public Director getDirector(){
        return director;
    }

    public void setNumOfAwards(int numOfAwards) {
        this.numOfAwards = numOfAwards;
    }

    public int getNumOfAwards() {
        return numOfAwards;
    }

    public String toString(){
        return "Movie [title = " + title + ", category = " + category + ", director name = " + director.getDName() + ", director surname = " + director.getDSurname() + ", number of awards =" + numOfAwards + "]";
    }

}
