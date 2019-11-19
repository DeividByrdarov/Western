public class Villain extends Villager {
    private int numOfBullets;
    private String banditName;
    private int wantedPrice;

    public Villain() {
    }

    public Villain(String name, String horseName, String favouriteWhisky, int numOfBullets, String banditName, int wantedPrice) {
        super(name, horseName, favouriteWhisky);
        this.numOfBullets = numOfBullets;
        this.banditName = banditName;
        this.wantedPrice = wantedPrice;
    }

    public Villain(Villager villager, int numOfBullets, String banditName, int wantedPrice) {
        super(villager.getName(), villager.getHorseName(), villager.getFavouriteWhisky());
        this.numOfBullets = numOfBullets;
        this.banditName = banditName;
        this.wantedPrice = wantedPrice;
    }

    public int Shoot() {
        if (numOfBullets == 0) {
            return 0;
        }

        this.numOfBullets -= 1;

        return (int) Math.round(Math.random() * 100) + 1;
    }

    public static String Skirmish(Villain villain1, Villain villain2) {
        String result;

        villain1.setHealthyNose(false);
        villain2.setHealthyNose(false);

        do {
            int v1Damage = villain1.Shoot();
            int v2Damage = villain2.Shoot();

            if (v1Damage > 70) {
                result = villain1.getName();
                break;
            }

            if (v2Damage > 70) {
                result = villain2.getName();
                break;
            }

            if (v1Damage == 0 && v2Damage == 0) {
                result = "DRAW";
                break;
            }
        } while(true);

        return result;
    }

    public int getNumOfBullets() {
        return numOfBullets;
    }

    public void setNumOfBullets(int numOfBullets) {
        this.numOfBullets = numOfBullets;
    }

    public String getBanditName() {
        return banditName;
    }

    public void setBanditName(String banditName) {
        this.banditName = banditName;
    }

    public int getWantedPrice() {
        return wantedPrice;
    }

    public void setWantedPrice(int wantedPrice) {
        this.wantedPrice = wantedPrice;
    }
}
