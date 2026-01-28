public class Person {
    private String name;
    private MyDate birthMyDate;

    public Person(String name, MyDate birthMyDate){
        this.name=name;
        this.birthMyDate = birthMyDate.copy();
    }
    public String getName(){
        return name;
    }
    public MyDate getBirthDate(){
        return birthMyDate.copy();
    }
}
