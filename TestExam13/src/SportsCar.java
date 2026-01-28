public class SportsCar extends Car{
    private int speed;
    public SportsCar(String model,int year,Engine engine,int speed){
        super(model,year,engine);
        this.speed=speed;
    }
    public int getSpeed(){
        return speed;
    }
    @Override
    public boolean equals(Object obj){
        if(obj ==null||getClass()!=obj.getClass())return false;
        SportsCar other=(SportsCar) obj;
        return super.equals(other)&&speed==other.speed;
    }
}
