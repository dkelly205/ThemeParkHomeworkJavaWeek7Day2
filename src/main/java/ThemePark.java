import java.util.ArrayList;

public class ThemePark {


    private int capacity;
    private String name;
    private double entryFee;
    private ArrayList<Ride> rides;
    private ArrayList<Customer> customers;

    public ThemePark(String name, int capacity, double entryFee) {
        this.name = name;
        this.capacity = capacity;
        this.entryFee = entryFee;
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
}
