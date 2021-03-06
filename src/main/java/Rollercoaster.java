public class Rollercoaster extends Ride implements IStart, IStop {

    private double cost;
    private double till;

    public Rollercoaster(String name, int minAge, double minHeight, int capacity, double cost, double till) {
        super(name, minAge, minHeight, capacity);
        this.cost = cost;
        this.till = till;

    }

    public double getCost() {
        return cost;
    }

    public void emptyRollercoaster() {
        riders.clear();
    }

    public double tillAmount() {
        return till;
    }

    public void charge(Customer customer){
        customer.pay(cost);
        till += cost;
    }

    public void addRider(Customer customer) {
        if(customer.getCash() >= getCost()) {
            if(eligble(customer) == true && getNumberOfRiders() < getCapacity()) {
                riders.add(customer);
                charge(customer);
            }
        }
    }

    @Override
    public String start(String ride) {
        return "Starting " + ride;
    }

    @Override
    public String stop(String ride) {
        return "Stopping " + ride;
    }
}
