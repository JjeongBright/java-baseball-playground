package view.constant;

public enum OutputMessage {

    ASK_PLAYER_NUMBER("숫자를 입력해 주세요 : " ),
    RESTART_GAME("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    END_GAME("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    ;

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
