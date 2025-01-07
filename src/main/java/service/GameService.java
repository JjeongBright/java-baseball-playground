package service;

import domain.Computer;
import domain.Player;
import domain.Result;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GameService {

    private final Computer computer;
    private final Player player;

    public GameService() {
        this.computer = new Computer();
        this.player = new Player();
    }

    public String startGame(String playerBall) throws Exception {
        List<Integer> computerBall = computer.initComputerNumber();
        validateUserNumber(playerBall);

        return calculateResult(playerBall, computerBall);
    }

    private void validateUserNumber(String playerBall) throws Exception {

        player.playerNumberCheck(playerBall);
        player.playerNumberLengthLimit(playerBall);
    }

    private String calculateResult(String playerBall, List<Integer> computerBall) {
        int ballCount = 0;
        int strikeCount = 0;


        for (int i = 0; i < playerBall.length(); i++) {
            int convertPlayerBall = Character.getNumericValue(playerBall.charAt(i));

            ballCount = checkBall(computerBall, convertPlayerBall, ballCount);
            strikeCount = checkStrike(i, computerBall, convertPlayerBall, strikeCount);
        }

        Result result = new Result(strikeCount, ballCount);
        return result.toString();
    }

    private int checkBall(List<Integer> computerBall,
                           int comparePlayerBall, int ballCount) {

        if(computerBall.contains(comparePlayerBall)) {
            return ++ballCount;
        }

        return 0;

    }

    private int checkStrike(int idx, List<Integer> computerBall,
                           int comparePlayerBall, int strikeCount) {

        if(computerBall.get(idx).equals(comparePlayerBall)) {
            return ++strikeCount;
        }
        return 0;
    }

}
