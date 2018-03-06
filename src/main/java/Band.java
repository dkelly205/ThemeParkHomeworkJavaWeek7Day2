public enum Band {

    YELLOW(30.00),
    GREEN(80.00);


    private final double price;

    Band(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

}


