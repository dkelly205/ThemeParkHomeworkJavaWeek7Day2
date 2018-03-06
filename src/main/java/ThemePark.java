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
    }

}