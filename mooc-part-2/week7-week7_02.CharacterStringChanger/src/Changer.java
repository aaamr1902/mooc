
import java.util.ArrayList;

public class Changer {

    private ArrayList<Change> changesList;

    public Changer() {
        this.changesList = new ArrayList<Change>();

    }

    public void addChange(Change change) {
        this.changesList.add(change);
    }

    public String change(String characterString) {
        for (Change change : changesList) {
            characterString = change.change(characterString);
        }
        return characterString;
    }
}
