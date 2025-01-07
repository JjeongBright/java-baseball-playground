package domain;

import view.Input;

public class Player {


    public void playerNumberLengthLimit(String playerNumber) throws Exception {
        if(playerNumber.length() != 3) {
            throw new Exception("숫자의 길이는 3이어야 합니다.");
        }
    }

    public void playerNumberCheck(String playerNumber) throws Exception {
        try {
            Integer.parseInt(playerNumber);
        } catch (NumberFormatException e) {
            throw new Exception("입력값이 잘못되었습니다.");
        }
    }

}
