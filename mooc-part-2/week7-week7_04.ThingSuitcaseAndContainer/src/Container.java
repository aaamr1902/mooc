
import java.util.ArrayList;

public class Container {

    private final int maxWeight;
    private int currentWeight;
    private ArrayList<Suitcase> suitcases;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.suitcases = new ArrayList<Suitcase>();  // Generics for Java 6
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + currentWeight <= maxWeight) {
            suitcases.add(suitcase);
            currentWeight += suitcase.totalWeight();
        }
    }

    @Override
    public String toString() {
        int count = suitcases.size();
        return count == 0
                ? "empty (0 kg)"
                : String.format("%d suitcase%s (%d kg)", count, count == 1 ? "" : "s", this.totalWeight());
    }

    private int totalWeight() {
        return this.currentWeight;
    }

    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }
}
