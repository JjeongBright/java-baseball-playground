package domain;

import util.Converter;
import util.RandomNumberGenerator;

import java.util.List;
import java.util.Set;

public class Computer {

    private final Converter converter;

    public Computer() {
        this.converter = new Converter();
    }

    public List<Integer> initComputerNumber() {
        return converter.convertList();
    }

}
