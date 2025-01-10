package domain;

public class Player {

    private int strikeCount;
    private int ballCount;

    public int incrementStrikeCount() {
        return strikeCount++;
    }

    public int incrementBallCount() {
        return ballCount++;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public void resetNumber() {
        strikeCount = 0;
        ballCount = 0;
    }


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

    public String generateResult(int strikeCount, int ballCount) {
        if(strikeCount > 0 && ballCount == 0) {
            return strikeCount + "스트라이크";
        }
        else if(ballCount > 0 && strikeCount == 0) {
            return ballCount + "볼";
        }
        else if(strikeCount > 0 && ballCount > 0) {
            return ballCount + "볼 " + strikeCount + "스트라이크";
        }
        return "낫싱";
    }

}
