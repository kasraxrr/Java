import java.util.ArrayList;
import java.util.Date;

public class Kennel {
    private Person owner;
    private ArrayList<Pet> pets;

    public Kennel(Person owner){
        this.owner=owner;
        pets=new ArrayList<>();
        if (owner==null){
            throw new IllegalArgumentException("Cec");
        }
    }
    public void sellTo(Person newOwner){
        this.owner=newOwner;
    }
    public void addPet(Pet pet){
        pets.add(pet);
    }
    public Pet hasPet(String id){
        for (int i = 0; i < pets.size() ; i++) {
            if (pets.get(i).getId().equals(id)){
                return pets.get(i);
            }
        }return null;
    }
    public void sellPet(String id){
        for (int i = 0; i < pets.size() ; i++) {
            if (pets.get(i).getId().equals(id)) {
                pets.remove(i);
                break;
            }
        }
    }
    public ArrayList<Pet> getPetsByBirthDate(int year,int month){
        ArrayList<Pet> petsB=new ArrayList<>();
        MyDate birth=new MyDate(0,month,year);
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i).getBirthDate().equals(birth)){
                petsB.add(pets.get(i));
            }
        }return petsB;
    }
    public boolean isAPureDogKennel(){
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i) instanceof Cat){
                return false;
            }
        }return true;
    }
    public Cat getAChippedCat(){
        for (int i=0;i<pets.size();i++){
            if (pets.get(i) instanceof Cat){
                Cat cat=(Cat)pets.get(i);
                if (cat.isChipped()){

                    return cat;
                }
            }
        }return null;
    }
    public ArrayList<String> getIdsBySpecies(String species){
        ArrayList<String>id=new ArrayList<>();
        for(int i=0;i<pets.size();i++){
            if (pets.get(i).getSpecies().equals(species)){
                id.add(pets.get(i).getId());
            }
        }return id;
    }
    public Dog[]getDogsByBirthYear(int year){
        MyDate date=new MyDate(0,0,year);
        ArrayList<Dog>dogs=new ArrayList<>();
        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i) instanceof Dog){
                Dog dog1=(Dog)pets.get(i);
                if (dog1.getBirthDate().equals(date)){
                    dogs.add(dog1);
                }
            }
        }return dogs.toArray(new Dog[0]);

    }


}
