package service;

import domain.Computer;
import domain.Player;

import java.util.List;

public class GameService {

    private final Computer computer;
    private final Player player;

    public GameService() {
        this.computer = new Computer();
        this.player = new Player();
    }

    public List<Integer> computerNumber() {
        return computer.initComputerNumber();
    }

    public void initUserSetting() {
        player.resetNumber();
    }

    private void validateUserNumber(String playerBall) throws Exception {

        player.playerNumberCheck(playerBall);
        player.playerNumberLengthLimit(playerBall);
    }

    public String progressBaseball(String playerBall, List<Integer> computerBall) throws Exception {
        validateUserNumber(playerBall);

        for (int i = 0; i < playerBall.length(); i++) {
            int convertPlayerBall = Character.getNumericValue(playerBall.charAt(i));

            updateUserCount(i, computerBall, convertPlayerBall);
        }

        return player.generateResult(player.getStrikeCount(), player.getBallCount());
    }

    private void updateUserCount(int idx, List<Integer> computerBall,
                                 int comparePlayerBall) {

        if(computerBall.get(idx).equals(comparePlayerBall)) {
            player.incrementStrikeCount();
        }

        else if(computerBall.contains(comparePlayerBall)) {
            player.incrementBallCount();
        }
    }

    public boolean checkGameOver() {
        return player.getStrikeCount() == 3;
    }

}
