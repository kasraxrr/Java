public class OrderLine {
    private int amount;
    private Item item;

    public OrderLine(Item item,int amount){
        if (item==null){
            throw new IllegalArgumentException();
        }
        this.amount=amount;
        this.item=item;
    }

    public Item getItem() {
        return item;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount){
        this.amount=amount;
    }
    @Override
    public boolean equals(Object obj){
        if (obj==null||getClass()!=obj.getClass())return false;
        OrderLine other=(OrderLine) obj;
        return amount==other.amount&& item.equals(other.item);
    }
    @Override
    public String toString(){
        return ""+item+amount;
    }

}


