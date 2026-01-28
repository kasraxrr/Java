public class Cat extends Pet{
    private boolean isChipped;
    public Cat(MyDate birthMyDate, String species, boolean isChipped){
        super(birthMyDate,species,"Cat");
    }

    public boolean isChipped() {
        return isChipped;
    }

    @Override
    public String toString() {
        return super.toString()+isChipped;
    }
}
