
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Create a HashMap object explicitly so PowerMock can intercept the constructor
        HashMap<String, String> nicknames = new HashMap<String, String>();

        // Adding key-value pairs to the map
        nicknames.put("matti", "mage");
        nicknames.put("mikael", "mixu");
        nicknames.put("arto", "arpa");

        // Printing the value for mikael
        System.out.println(nicknames.get("mikael"));
    }
}
