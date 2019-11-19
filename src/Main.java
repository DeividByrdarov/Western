public class Main {
    public static void main(String[] args) {
        Villain billy = new Villain("Били", "", "", 8, "Били", 1000);
        Villain bartender = new Villain("Bartender", "", "", 8, "Bartender", 0);

        Villager jon = new Villager("Джон Смит", "", "");

        String result = Villain.Skirmish(billy, new Villain(jon, bartender.getNumOfBullets(), "Джониии", 0));

        System.out.println("Winner: " + result);
    }
}
