
public class Vehicle {

    protected String model;
    protected int weight;

    public Vehicle(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " - " + this.model + ", " + this.weight;
    }

    @Override
    public boolean equals(Object object) {
        return (object instanceof Vehicle vehicle)
                && this.model.equals(vehicle.model)
                && this.weight == vehicle.weight;
    }

}
