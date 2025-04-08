
import java.util.Scanner;

public class Reader {
    private Scanner scanner;

    public Reader() {
        this.scanner = new Scanner(System.in);
    }

    public String readString() {
        String inputString = scanner.nextLine();
        return inputString;
    }

    public int readInteger() {
        String inputString = scanner.nextLine();
        int inputInteger = Integer.parseInt(inputString);
        return inputInteger;
    }

}
