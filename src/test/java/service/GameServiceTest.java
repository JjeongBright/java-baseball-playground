package service;

import domain.Computer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.Input;
import view.Output;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class GameServiceTest {

    Input input = new Input();
    Scanner scanner = new Scanner(System.in);
    Output output = new Output();

    @Test
    public void testGame() throws Exception {
        GameService gameService = new GameService();
        String next = "159";

        output.printResult(gameService.startGame(next));
    }

    @Test
    public void testSet() {
        Computer computer = new Computer();
        List<Integer> integers = computer.initComputerNumber();

        integers.forEach(e -> {
            System.out.println("e = " + e);
        });
    }

}