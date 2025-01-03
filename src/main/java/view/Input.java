package view;

import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String playerInputNumber() {
        return scanner.next();
    }

}
