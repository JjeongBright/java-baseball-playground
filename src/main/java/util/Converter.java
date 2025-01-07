package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Converter {

    public List<Integer> convertList() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        return List.copyOf(randomNumberGenerator.generateOpponentNumbers());
    }

}
