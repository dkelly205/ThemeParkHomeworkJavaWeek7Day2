import java.util.ArrayList;

public abstract class Ride {

    private String name;
    private int minAge;
    private double minHeight;
    private int capacity;
    public ArrayList<Customer> riders; //do you need to make that public?  //needs a getter to allow a child class to access it!!

    public Ride(String name, int minAge, double minHeight, int capacity) {
        this.name = name;
        this.minAge = minAge;
        this.minHeight = minHeight;
        this.capacity = capacity;
        this.riders = new ArrayList<>();
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

    public int getNumberOfRiders() {
        return riders.size();
    }

    public void addRider(Customer customer) {
        if(eligble(customer) == true && getNumberOfRiders() < getCapacity()) {
            riders.add(customer);
        }
    }

    public void removeRider(Customer customer) {
        riders.remove(customer);
    }

    public boolean eligble(Customer customer){
        if(customer.getHeight() >= minHeight && customer.getAge() >= minAge){
            return true;
        } else {
                return false;
                }
    }


    //getter for arraylist - -read comments above in properties
    public ArrayList<Customer> getRiders() {
        return new ArrayList<Customer>(this.riders);
    }

}
