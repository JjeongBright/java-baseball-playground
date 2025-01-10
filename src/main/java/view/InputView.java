package view;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static String playerInputNumber() {
        return scanner.next();
    }

    public static int restartInputNumber() {
        return scanner.nextInt();
    }

}
