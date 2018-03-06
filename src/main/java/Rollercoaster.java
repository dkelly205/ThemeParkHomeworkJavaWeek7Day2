public class Rollercoaster extends Ride {

    private double cost;

    public Rollercoaster(String name, int minAge, double minHeight, int capacity, double cost) {
        super(name, minAge, minHeight, capacity);
        this.cost = cost;

    }

    public double getCost() {
        return cost;
    }
}
