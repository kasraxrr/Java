import java.util.ArrayList;

public class RoseGarden {
    private ArrayList<Rose> roses;
    private Address address;

    public RoseGarden(Address address) {
        this.address = address;
        roses = new ArrayList<>();
    }

    public Address getAddress() {
        return address;
    }

    public int getNumberOfRoses() {
        return roses.size();
    }

    public Rose get(int index) {
        return roses.get(index);
    }

    public ArrayList<Rose> getByColour(String colour) {
        ArrayList<Rose> CR = new ArrayList<>();
        for (int i = 0; i < getNumberOfRoses(); i++) {
            if (roses.get(i).hasColour(colour)) {
                CR.add(roses.get(i));
            }

        }
        return CR;
    }

    public ArrayList<RedRose> getAllDarkColourRoses() {
        ArrayList<RedRose> DR = new ArrayList<>();
        for (int i = 0; i < getNumberOfRoses(); i++) {
            if (roses.get(i) instanceof RedRose) {
                if (((RedRose) roses.get(i)).idDarkRed()) {

                    DR.add((RedRose) roses.get(i));
                }
            }

        }
        return DR;
    }

    public int getNumberOfDoubleColourRosesByColour(String colour) {
        int nu = 0;
        for (int i = 0; i < getNumberOfRoses(); i++) {
            if (roses.get(i) instanceof MultiColourRose) {
                if ((roses.get(i).hasColour(colour) && roses.get(i).getNumberOfColours() == 2)) {

                    nu++;
                }
            }
        }
        return nu;

    }
    public ArrayList<Rose>pickBouquetByColour(String colour,int size){
        ArrayList<Rose> DR = new ArrayList<>();
        for (int i = 0; i < getNumberOfRoses(); i++) {
            if (roses.get(i).hasColour(colour)&&roses.get(i).getNumberOfColours()==1){
                DR.add(roses.get(i));
                size--;
                if (size==0)break;
            }
            if (size>getNumberOfRoses()){
                throw new IllegalArgumentException("We dont have that much!!");
            }
        }return DR;
    }
}