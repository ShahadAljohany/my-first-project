package vehicle_management_system;

public class Truck extends Vehicle {

    private int cargo_capacity;

    public Truck(int cargo_capacity, String owner_name, String Brand, String model, int year) {
        super(owner_name, Brand, model, year);
        this.cargo_capacity = cargo_capacity;
    }

    public int getCargo_capacity() {
        return cargo_capacity;
    }

    public void setCargo_capacity(int cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }

    @Override
    public void display() {
        System.out.println(" Owner: " + getOwner_name()
                + "\n Car: " + getBrand() + " model: " + getModel() + " year: (" + getYear() + ")"
                + "\n Cargo Capacity: " + cargo_capacity + " tons");
    }
}
