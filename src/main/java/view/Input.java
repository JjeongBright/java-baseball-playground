package view;

import java.util.Scanner;

public class Input {

    private static Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public static String playerInputNumber() {
        return scanner.next();
    }

}
