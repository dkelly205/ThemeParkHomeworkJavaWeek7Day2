import java.util.ArrayList;

public class ThemePark {


    private int capacity;
    private String name;
    private double entryFee;
    private double cash;
    private ArrayList<Ride> rides;
    private ArrayList<Customer> customers;

    public ThemePark(String name, int capacity, double entryFee, double cash) {
        this.name = name;
        this.capacity = capacity;
        this.entryFee = entryFee;
        this.cash = cash;
        customers = new ArrayList<>();
        rides = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public double getEntryFee() {
        return entryFee;
    }


    public int getNumberOfCustomers() {
        return customers.size();
    }


    public double getCash() {
        return cash;
    }

    public void chargeEntry(Customer customer) {
        if (customer.getCash() >= getEntryFee()) {
            customer.pay(getEntryFee());
            cash += entryFee;
        }
    }

    public void add(Customer customer) {
        if (getNumberOfCustomers() < getCapacity() && customer.getCash() >= getEntryFee() ) {
            chargeEntry(customer);
            customers.add(customer);
        }


    }
}



