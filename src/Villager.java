public class Villager {
    private int numOfLegs;
    private int numOfHands;
    private int numOfEyes;
    private boolean healthyNose;

    private String name;
    private String horseName;
    private String favouriteWhisky;

    public Villager() {
        this.numOfLegs = 2;
        this.numOfHands = 2;
        this.numOfEyes = 2;
        this.healthyNose = true;
    }

    public Villager(String name, String horseName, String favouriteWhisky) {
        this.numOfLegs = 2;
        this.numOfHands = 2;
        this.numOfEyes = 2;
        this.healthyNose = true;
        this.name = name;
        this.horseName = horseName;
        this.favouriteWhisky = favouriteWhisky;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public int getNumOfHands() {
        return numOfHands;
    }

    public void setNumOfHands(int numOfHands) {
        this.numOfHands = numOfHands;
    }

    public int getNumOfEyes() {
        return numOfEyes;
    }

    public void setNumOfEyes(int numOfEyes) {
        this.numOfEyes = numOfEyes;
    }

    public boolean isHealthyNose() {
        return healthyNose;
    }

    public void setHealthyNose(boolean healthyNose) {
        this.healthyNose = healthyNose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    public String getFavouriteWhisky() {
        return favouriteWhisky;
    }

    public void setFavouriteWhisky(String favouriteWhisky) {
        this.favouriteWhisky = favouriteWhisky;
    }
}
