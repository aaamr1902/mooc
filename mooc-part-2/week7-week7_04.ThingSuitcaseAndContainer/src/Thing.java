
public class Thing {

    private final String name;
    private int weight;

    public Thing(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void increaseWeight(int increasedWeight) {
        if (increasedWeight > 0) this.weight += increasedWeight;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }
}
