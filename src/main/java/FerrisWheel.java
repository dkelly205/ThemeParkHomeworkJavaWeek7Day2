public class FerrisWheel extends Ride implements Start{


    private double till;
    private double cost;

    public FerrisWheel(String name, int minAge, double minHeight, int capacity, double cost, double till) {
        super(name, minAge, minHeight, capacity);
        this.cost = cost;
        this.till = till;
    }

    @Override
    public String start(String ride) {
        return "Starting " + ride;
    }
}
