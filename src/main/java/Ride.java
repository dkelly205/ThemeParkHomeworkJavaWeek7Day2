import java.util.ArrayList;

public abstract class Ride {

    private String name;
    private int minAge;
    private double minHeight;
    private int capacity;
    private ArrayList<Customer> queue;

    public Ride(String name, int minAge, double minHeight, int capacity) {
        this.name = name;
        this.minAge = minAge;
        this.minHeight = minHeight;
        this.capacity = capacity;
        this.queue = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMinAge() {
        return minAge;
    }

    public double getMinHeight() {
        return minHeight;
    }

    public int getCapacity() {
        return capacity;
    }
}
