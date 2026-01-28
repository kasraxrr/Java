public class RoomWithPlumbing extends Room{
    private boolean floorDrain;
    public RoomWithPlumbing(String name,double size,boolean floorDrain){
        super(name, size);
        this.floorDrain=floorDrain;
    }
    public boolean hasFloorDrain(){
        return floorDrain;
    }
    public Room copy(){
        return new Room(getName(),getSize());
    }
    @Override
    public String toString(){
        return super.toString()+floorDrain;
    }
}
