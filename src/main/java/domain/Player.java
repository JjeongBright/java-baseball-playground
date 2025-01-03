package domain;

import view.Input;

public class Player {

    private final Input input;

    public Player(Input input) {
        this.input = new Input();
    }

    public String playerNumber() {
        return input.playerInputNumber();
    }

    public int playerNumberLength() {
        return playerNumber().length();
    }

    public void playerNumberLengthLimit() throws Exception {
        if(playerNumberLength() != 3) {
            throw new Exception("숫자의 길이는 3이어야 합니다.");
        }
    }

    public void playerNumberCheck() throws Exception {
        try {
            Integer.parseInt(playerNumber());
        } catch (NumberFormatException e) {
            throw new Exception("입력값이 잘못되었습니다.");
        }
    }

    public void initPlayerNumber() throws Exception {
        playerNumber();
        playerNumberLengthLimit();
        playerNumberCheck();
    }


}
