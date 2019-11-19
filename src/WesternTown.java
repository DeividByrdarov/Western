public class WesternTown {
    private String location;
    private int yearOfSettle;
    private int numOfBars;
    private int numOfSheriffs;

    public WesternTown() {
        this.location = "West America";
        this.yearOfSettle = 1850;
        this.numOfBars = 2;
        this.numOfSheriffs = 1;
    }

    public WesternTown(String location, int yearOfSettle, int numOfBars, int numOfSheriffs) {
        this.location = location;
        this.yearOfSettle = yearOfSettle;
        this.numOfBars = numOfBars;
        this.numOfSheriffs = numOfSheriffs;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getYearOfSettle() {
        return yearOfSettle;
    }

    public void setYearOfSettle(int yearOfSettle) {
        this.yearOfSettle = yearOfSettle;
    }

    public int getNumOfBars() {
        return numOfBars;
    }

    public void setNumOfBars(int numOfBars) {
        this.numOfBars = numOfBars;
    }

    public int getNumOfSheriffs() {
        return numOfSheriffs;
    }

    public void setNumOfSheriffs(int numOfSheriffs) {
        this.numOfSheriffs = numOfSheriffs;
    }
}
