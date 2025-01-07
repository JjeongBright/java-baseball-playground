package view;

public class Output {

    public static void getPlayerInputNumber() {
        System.out.println("숫자를 입력해 주세요");
    }

    public static void resetGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public static void endGame() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void printResult(String result) {
        System.out.println(result);
    }

}
