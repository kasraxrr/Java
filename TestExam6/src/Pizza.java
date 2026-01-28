public class Pizza {
    private String name;
    private double initialPrice;
    private int numberOfToppings;
    private Topping[]toppings;
    private static final int MAX_NUMBER_OF_TOPPINGS=0;

    public Pizza(String name,double initialPrice){
        this.name=name;
        this.initialPrice=initialPrice;
        this.numberOfToppings=0;
        this.toppings=new Topping[MAX_NUMBER_OF_TOPPINGS];
    }
    public int getNumberOfToppings(){
        return numberOfToppings;
    }
    public String getName(){
        return name;
    }
    public void addTopping(Topping topping){
        if (numberOfToppings>=MAX_NUMBER_OF_TOPPINGS){
            throw new IllegalStateException("to many toppings");

        }
        if (toppings==null){
            throw new IllegalArgumentException("topping can not be null");

        }
        toppings[numberOfToppings]=topping;
        numberOfToppings++;
    }
    public void removeTopping(Topping topping){
        for (int i=0;i<numberOfToppings;i++){
            if (toppings[i].getName().equals(topping)){
                toppings[i]=null;
                toppings[i]=toppings[numberOfToppings];
                numberOfToppings--;
            }
        }
    }
    public double getTotalPrice(){
        double sum=initialPrice;
        for (int i=0;i<numberOfToppings;i++){
            sum+=toppings[i].getPrice();
        }return sum;
    }
}
