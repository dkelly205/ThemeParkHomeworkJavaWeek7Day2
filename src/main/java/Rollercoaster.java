public class Rollercoaster extends Ride {

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



    public void addRider(Customer customer) {
        if(customer.getCash() >= getCost()) {
            if(getNumberOfRiders() < getCapacity()) {
                riders.add(customer);
            }
        }
    }


    public double tillAmount() {
        return till;
    }
}
