import java.util.ArrayList;

public class CarRental {
    private String companyName;
    private String address;
    private ArrayList<Car>carsForRent;

    public CarRental(String companyName,String address){
        this.companyName=companyName;
        this.address=address;
        carsForRent=new ArrayList<>();
    }
    public String getCompanyName(){
        return companyName;
    }
    public String getAddress(){
        return address;
    }
    public int getNumberOfCars(){
        return carsForRent.size();
    }
    public Car getCar(int index){
        return carsForRent.get(index);
    }
    public void addCar(Car car){
        carsForRent.add(car);
    }
    public Car getCarByLicense(String licenseNo){
        for (int i=0;i<carsForRent.size();i++){
            if (carsForRent.get(i).getLicenceNo().equals(licenseNo)){
                return carsForRent.get(i);
            }
        }
        return null;
    }
    public SportsCar getAvailableSportsCar(){
        for (int i=0;i<carsForRent.size();i++){
            if (carsForRent.get(i).getType().equals("Sport")){
                if (carsForRent.get(i).isAvailable()){
                    return (SportsCar) carsForRent.get(i);
                }
            }
        }return null;
    }
    public Van getAvailableVan(int minCapacity){
        for (int i=0;i<carsForRent.size();i++){
            if (carsForRent.get(i).getType().equals("Van")){

                if (carsForRent.get(i).isAvailable()){
                    Van van = (Van)carsForRent.get(i);
               if (van.getCapacity()>=minCapacity){
                   return (Van)carsForRent.get(i);
               }

              }

            }
        }return null;
    }
}
