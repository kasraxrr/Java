public abstract class Pet {
    private  String id;
    private String species;
    private static int running_ID=1001;
    private MyDate birthMyDate;

    public Pet(MyDate brithMyDate, String species, String prefixId){
        this.birthMyDate = brithMyDate.copy();
        this.species=species;
        this.id=prefixId+running_ID;
    }
    public String getId(){
        return id;
    }
    public String getSpecies(){
        return species;
    }

    public MyDate getBirthDate() {
        return birthMyDate;
    }
    public String toString(){
        return id+species+ birthMyDate;
    }
}
