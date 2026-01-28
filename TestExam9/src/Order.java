public class Order {
    private int numberOfOrderLines;
    private OrderLine[]orderLines;
    public Order(int maxNumberOfOrderLines){
        this.numberOfOrderLines=0;
        orderLines=new OrderLine[maxNumberOfOrderLines];
    }
    public void addOrderLine(Item item,int amount){
        OrderLine ol=new OrderLine(item,amount);
        for (int i=0;i<orderLines.length;i++){
            if (orderLines[i]==null){
                orderLines[i]=ol;
                numberOfOrderLines++;
            }
        }
    }
    public int getNumberOfOrderLines(){
        return numberOfOrderLines;
    }
    public double getTotalPrice(){
        double sum=0;
        for (int i=0;i<orderLines.length;i++){
          return orderLines[i].getAmount()*orderLines[i].getItem().getPrice();

        }
        return 0;
    }
    public Item getOrderItem(int orderLineIndex){
        for (int i=0;i<orderLines.length;i++){
            return orderLines[i].getItem();

        }
        return null;
    }
    public int getAmountOfOrderItems(int orderLineIndex){
        for (int i=0;i<orderLines.length;i++){
            return orderLines[i].getAmount();

        }return 0;
    }
    public double getTotalWeightForWeightedItems(){
        double totalWeight=0;
        for (int i=0;i<orderLines.length;i++){
            if (orderLines[i].getItem()instanceof WeighedItem){
                WeighedItem wi=(WeighedItem) orderLines[i].getItem();
               totalWeight+= wi.getWeight();
            }
        }return totalWeight;
    }
    @Override
    public String toString(){
        return ""+orderLines+numberOfOrderLines;
    }



}
