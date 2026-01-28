import java.util.ArrayList;
import java.util.Arrays;

public class House {
    private ArrayList<Room>rooms;

    public House(Room[]rooms){
        for (int i=0;i<rooms.length;i++){
            this.rooms.add(rooms[i]);
        }
    }
    public int getNumberOfRooms(){
        return rooms.size();
    }
    public double getTotalSize(){
        double totalSize=0;
        for (int i=0;i<rooms.size();i++){
            totalSize+=rooms.get(i).getSize();
        }return totalSize;
    }
    public int getNumberOfBathrooms(){
        int batrooms=0;
        for (int i=0;i<rooms.size();i++){
            if (rooms.get(i) instanceof BathRoom){
                batrooms++;
            }

        }return batrooms;
    }
    public void rebuildRoom(int index,Room room){
        rooms.remove(index);
        rooms.add(index,room);
    }
    public void combineTwoRoomsIntoOne(int index1,int index2,Room room){
        rooms.remove(index1);
        rooms.remove(index2);
        rooms.add(index1,room);
    }
    @Override
    public String toString(){
        return ""+rooms;
    }
}
