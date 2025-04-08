import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> words;

    public Dictionary() {
        this.words = new HashMap();
    }

    public void add(String word, String translation) {
        words.put(word, translation);
    }

    public String translate(String word) {
        try {
            return words.get(word);
        } catch (Exception e) {
            return null;
        }
    }

    public int amountOfWords() {
        return words.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translations = new ArrayList();
        for (String word : words.keySet()) {
            translations.add(word + " = " + words.get(word));
        } return translations;
    }
}
