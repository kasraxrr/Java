public class BathRoom extends RoomWithPlumbing{
    private boolean hasShower;
    public BathRoom(double size,boolean hasShower){
        super("bathRoom",size,true);
        this.hasShower=hasShower;
    }
    public boolean hasShower(){
        return hasShower;
    }
    public Room copy(){
        return new Room(getName(),getSize());
    }
    @Override
    public String toString(){
        return super.toString()+hasShower;
    }
}
