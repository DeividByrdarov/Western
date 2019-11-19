import java.util.Random;

public class Sheriff extends Villain {
    @Override
    public int Shoot() {
        if (this.getNumOfBullets() == 0) {
            return 0;
        }

        this.setNumOfBullets(this.getNumOfBullets() - 1);

        Random random = new Random();

        return random.nextInt(100 + 1 - 20) + 20;
    }
}
