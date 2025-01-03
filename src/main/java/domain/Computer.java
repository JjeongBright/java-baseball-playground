package domain;

import util.RandomNumberGenerator;

import java.util.Set;

public class Computer {

    private final RandomNumberGenerator randomNumberGenerator;


    public Computer(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = new RandomNumberGenerator();
    }

    public Set<Integer> initComputerNumber() {
        return randomNumberGenerator.generateOpponentNumbers();
    }

}
