public class Car {
    private String model;
    private int year;
    private Engine engine;

    public Car(String model, int year, Engine engine) {
        this.year = year;
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car other = (Car) obj;
        return year == other.year && model.equals(other.model) && engine.equals(other.engine);

    }
}
