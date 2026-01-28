public class Tenant {
    private String name;
    private MyDate rentedFrom;

    public Tenant(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public MyDate getRentedFrom() {
        return rentedFrom.copy();
    }

    public void setRentedFrom(MyDate date) {
        if (date==null){
            throw new IllegalArgumentException("date can not be null");
        }
        this.rentedFrom = date.copy();
    }
}
