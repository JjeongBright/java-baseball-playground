package controller;

import service.GameService;
import view.InputView;
import view.OutputView;

import java.util.List;

public class GameController {

    private final GameService gameService;

    public GameController() {
        this.gameService = new GameService();
    }

    private void progressGame() throws Exception {
        List<Integer> computerNumber = gameService.computerNumber();
        gameService.initUserSetting();

        while(!gameService.checkGameOver()) {
            OutputView.getPlayerInputNumber();
            String playerInputNumber = InputView.playerInputNumber();
            OutputView.printResult(gameService.progressBaseball(playerInputNumber, computerNumber));
        }

        processGameEnd();
    }

    private void processGameEnd() throws Exception {

        OutputView.endGameMessage();
        OutputView.restartGameMessage();
        int inputNumber = InputView.restartInputNumber();

        if(inputNumber == 1) progressGame();
        else if(inputNumber == 2) System.exit(0);

    }

    public void executeGame() throws Exception {
        progressGame();
    }

}
