
public class Main {
    public static void main(String[] args) {

        // Testing Change class
        String word = "carrot";
        Change change1 = new Change('a', 'b');
        word = change1.change(word);
        System.out.println(word); // Output: cbrrot

        Change change2 = new Change('r', 'x');
        word = change2.change(word);
        System.out.println(word); // Output: cbxxot

        // Testing Changer class
        Changer scandiesAway = new Changer();
        scandiesAway.addChange(new Change('ä', 'a'));
        scandiesAway.addChange(new Change('ö', 'o'));
        System.out.println(scandiesAway.change("ääliö älä lyö, ööliä läikkyy")); // Output: aalio ala lyo, oolia laikkyy
    }


}