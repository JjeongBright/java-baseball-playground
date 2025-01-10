package view;

import view.constant.OutputMessage;

public class OutputView {


    public static void getPlayerInputNumber() {
        System.out.println(OutputMessage.ASK_PLAYER_NUMBER.getMessage());
    }

    public static void restartGameMessage() {
        System.out.println(OutputMessage.RESTART_GAME.getMessage());
    }

    public static void endGameMessage() {
        System.out.println(OutputMessage.END_GAME.getMessage());
    }

    public static void printResult(String result) {
        System.out.println(result);
    }

}
