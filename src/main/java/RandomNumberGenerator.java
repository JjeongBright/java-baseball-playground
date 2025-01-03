import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumberGenerator {

    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }

    public Set<Integer> generateOpponentNumbers() {
        Set<Integer> opponentNumbers = new HashSet<>();
        while(opponentNumbers.size() <= 3) {
            opponentNumbers.add(generateRandomNumber());
        }
        return opponentNumbers;
    }

}
