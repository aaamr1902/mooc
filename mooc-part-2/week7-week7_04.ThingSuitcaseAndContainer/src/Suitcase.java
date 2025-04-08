
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> things;
    private final int maxWeight;
    private int currentWeight;

    public Suitcase(int maxWeight) {
        this.things = new ArrayList<Thing>();  // Generics for Java 6
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    public void addThing(Thing thing) {
        if (thing.getWeight() + currentWeight <= maxWeight) {
            things.add(thing);
            currentWeight += thing.getWeight();
        }
    }

    public int totalWeight() {
        return currentWeight;
    }

    @Override
    public String toString() {
        int count = things.size();
        return count == 0
                ? "empty (0 kg)"
                : String.format("%d thing%s (%d kg)", count, count == 1 ? "" : "s", this.totalWeight());
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public Thing heaviestThing() {
        Thing heaviestThing = null;
        try {
            if (things.size() > 0) {
                heaviestThing = things.get(0);  // Corrected: getFirst() is not available
                for (Thing thing : things) {
                    if (thing.getWeight() > heaviestThing.getWeight()) {
                        heaviestThing = thing;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return heaviestThing;
    }
}
