public class FerrisWheel extends Ride {


    private double till;
    private double cost;

    public FerrisWheel(String name, int minAge, double minHeight, int capacity, double cost, double till) {
        super(name, minAge, minHeight, capacity);
        this.cost = cost;
        this.till = till;
    }
}
