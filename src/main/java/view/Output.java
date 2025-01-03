package view;

public class Output {

    public void getPlayerInputNumber() {
        System.out.println("숫자를 입력해 주세요");
    }

    public void resetGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public void printResult(String result) {
        System.out.println(result);
    }

}
