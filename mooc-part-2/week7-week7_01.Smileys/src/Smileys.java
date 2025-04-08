
public class Smileys {

    private static void printWithSmileys(String characterString) {

        // adjust length of characterString
        if (characterString.startsWith("\\")) {
            characterString = characterString.substring(1);
        }

        // prepend and append spaces
        characterString = " " + characterString + " ";

        // add extra space if odd length
        int length = characterString.length();
        if (!(length % 2 == 0)) {
            characterString = characterString.concat(" ");
        }

        String printString = ":)" + characterString + ":)";

        printSmiley(printString.length()/2);
        System.out.println(printString);
        printSmiley(printString.length()/2);

    }

    private static void printSmiley(int times) {

        for (int i = 0; i < times; i++) {
            System.out.print(":)");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        printWithSmileys("\\:D/");
        printWithSmileys("87.");
        printWithSmileys("Arto");

    }

}
