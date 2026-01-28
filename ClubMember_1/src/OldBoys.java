public class OldBoys extends ClubMember{
    private int yearsOfMembership;

    public OldBoys(String name,int age,int yearsOfMembership){
        super(name,age);
        this.yearsOfMembership=yearsOfMembership;
    }
    public void setYearsOfMembership(int years){
        yearsOfMembership=years;
    }
    @Override
    public String toString(){
        return super.toString()+yearsOfMembership;
    }

    @Override
    public double getMembershipFee() {
        return 79.99;
    }
}
