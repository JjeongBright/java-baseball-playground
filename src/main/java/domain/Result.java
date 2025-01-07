package domain;

public class Result {

    private final int strikeCount;
    private final int ballCount;

    public Result(int ballCount, int strikeCount) {
        this.ballCount = ballCount;
        this.strikeCount = strikeCount;
    }

    @Override
    public String toString() {
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
