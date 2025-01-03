import java.util.Scanner;

public class input {

    private final Scanner scanner;

    public input() {
        this.scanner = new Scanner(System.in);
    }

    public String inputNumber() {
        return scanner.next();
    }

}
