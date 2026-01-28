public class Address {
    private String town;
    private int zipCode;
    private String streetAndNumber;

    public Address(int zipCode,String town,String streetAndNumber){
        this.town=town;
        this.zipCode=zipCode;
        this.streetAndNumber=streetAndNumber;
    }
    public  void setZipCode(int zipCode){
        this.zipCode=zipCode;
    }
    public Address copy(){
        return new Address(zipCode,town,streetAndNumber);
    }
    @Override
    public String toString(){
        return town+zipCode+streetAndNumber;
    }
}
