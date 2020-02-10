public class Movie {

    private String title;
    private int year;
    private double averageRating;
    private String director;
    private int budget;
    private int income;

    public Movie(String title, int year, double averageRating, String director, int budget, int income) {
        this.title = title;
        this.year = year;
        this.averageRating = averageRating;
        this.director = director;
        this.budget = budget;
        this.income = income;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }
}
