package vehicle_management_system;

public class Motorcycle extends Vehicle {

    private int engine_size;

    public Motorcycle(int engine_size, String owner_name, String Brand, String model, int year) {
        super(owner_name, Brand, model, year);
        this.engine_size = engine_size;
    }

    public int getEngine_size() {
        return engine_size;
    }

    public void setEngine_size(int engine_size) {
        this.engine_size = engine_size;
    }

    @Override
    public void display() {
        System.out.println(" Owner: " + getOwner_name()
                + "\n Car: " + getBrand() + " model: " + getModel() + " year: (" + getYear() + ")"
                + "\n Engine Size: " + engine_size + " cc");
    }

}
