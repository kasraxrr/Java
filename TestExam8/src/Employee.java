public abstract class Employee {
    private String name;
    private Date birthday;

    public Employee(String name,Date birthday){
        this.name=name;
        if (birthday==null){
            throw new IllegalArgumentException("birthday can not be null");
        }
        this.birthday=birthday.copy();
    }
    public String getName(){
        return name;
    }
    public void setName(String  name){
        this.name=name;
    }
    public Date getBirthday(){
        return birthday;
    }
    @Override
    public String toString() {
        return  name+birthday;
    }
    @Override
    public boolean equals(Object obj){
        if (obj==null||getClass()!=obj.getClass())return false;
        Employee other=(Employee) obj;
        return name.equals(other.name)&&birthday.equals(other.birthday);
    }
    public abstract double earningsPerWeek();
}
