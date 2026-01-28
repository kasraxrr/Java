import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Car> cars;
    private SportsCar sportsCar;

    public Person(String name) {
        this.name = name;
        this.cars = new ArrayList<>();
        this.sportsCar = null;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfCars() {
        return cars.size();
    }

    public void buyACar(Car car) {
        cars.add(car);
    }

    public void sellACar(Car car) {
        cars.remove(car);
    }

    public void registerAsSportsCarDriver(SportsCar car) {
        sportsCar = car;
    }

    public boolean doYouOwnTheSportsCarYouDrive() {
        for (int i = 0; i < getNumberOfCars(); i++) {
            if (cars.get(i) instanceof SportsCar) return true;
        }
        return false;
    }

    public void sellTheOldestCar() {
        Car oldestCar = null;
        for (int i = 0; i < getNumberOfCars(); i++) {
            if (cars.get(i).getYear() > cars.get(i + 1).getYear()) {
                oldestCar = cars.get(i);
            }
        }
        cars.remove(oldestCar);
    }

    public Car getOwnedCarWithLargestEngin() {
        Car largest = null;
        for (int i = 0; i < getNumberOfCars(); i++) {
            if (cars.get(i).getEngine().getSize() > cars.get(i + 1).getEngine().getSize()) {
                largest = cars.get(i);
            }
            for (int j = 0; j < cars.size(); j++) {
                if (cars.get(i).equals(largest)) {
                    return cars.get(i);
                }
            }
        }
        return null;
    }
    public SportsCar[] getAllSportsCarOwned(){
        ArrayList<SportsCar>allSport=new ArrayList<>();
        for (int i = 0; i < getNumberOfCars(); i++) {
            if (cars.get(i) instanceof SportsCar){
                allSport.add((SportsCar) cars.get(i));
            }
        }
        return allSport.toArray(new SportsCar[0]);
    }
}
