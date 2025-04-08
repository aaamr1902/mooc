
import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statement:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quit the text user interface");

        while (true) {
            System.out.print("Statement: ");
            String statement = reader.nextLine();

            if (statement.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }
            else if (statement.equals("add")) addWordPair();
            else if (statement.equals("translate")) System.out.println("Translation:" + translate());
            else {
                System.out.println("Unknown statement");
                System.out.println("");
            }

        }
    }

    public void addWordPair() {
        System.out.print("In Finnish: ");
        String word = reader.next();

        System.out.print("Translation: ");
        String translation = reader.next();

        dictionary.add(word, translation);
    }

    private String translate() {
        System.out.print("Give a word: ");
        String word = reader.next();
        return dictionary.translate(word);
    }

}
