package service;

import domain.Computer;
import org.junit.jupiter.api.Test;
import view.InputView;
import view.OutputView;

import java.util.List;
import java.util.Scanner;

class GameServiceTest {

    InputView inputView = new InputView();
    Scanner scanner = new Scanner(System.in);
    OutputView outputView = new OutputView();

    @Test
    public void testGame() throws Exception {
        GameService gameService = new GameService();
        String next = "159";

        outputView.printResult(gameService.executeGameRound(next));
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