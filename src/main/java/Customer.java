public class Customer {


    private double cash;
    private double height;
    private int age;
    private String name;
    private Band band;

    public Customer(String name, int age, double height, double cash, Band band) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.cash = cash;
        this.band = band;

    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getCash() {
        return cash;
    }
}
