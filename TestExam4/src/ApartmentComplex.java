import java.util.ArrayList;

public class ApartmentComplex {
    private String address;
    private ArrayList<Residence>residences;

    public ApartmentComplex(String address){
        this.address=address;
        this.residences=new ArrayList<>();
    }
    public int getNumberOfResidences(){
        return residences.size();
    }
    public void add(Residence residence){
        residences.add(residence);
    }
    public Residence getResidence(int index){
        return residences.get(index);
    }
    public Residence getResidenceByNumber(int number){
        for (int i=0;i<residences.size();i++){
            if (residences.get(i).getNumber()==number){
                return residences.get(i);
            }
        }return null;
    }
    public Room getFirstAvailableRoom(){
        for (int i=0;i<residences.size();i++){
            if (residences.get(i).getType().equals("Room")&&residences.get(i).isAvailable()){
                return (Room) residences.get(i);
            }
        }return null;
    }
    public Apartment getFirstAvailableApartment(int minNumberOfRooms){
        for (int i=0;i<residences.size();i++){
            if (residences.get(i).getType().equals("Apartment")&&residences.get(i).getNumberOfRooms()>=minNumberOfRooms){
                Apartment apartment1=(Apartment) residences.get(i);
                return apartment1;
            }
        }return null;
    }

}
