package vehicle_management_system;

public class Car extends Vehicle {

    private int seating_capacity;

    public Car(int seating_capacity, String owner_name, String Brand, String model, int year) {
        super(owner_name, Brand, model, year);
        this.seating_capacity = seating_capacity;
    }

    public int getSeating_capacity() {
        return seating_capacity;
    }

    public void setSeating_capacity(int seating_capacity) {
        this.seating_capacity = seating_capacity;
    }

    @Override
    public void display() {
        System.out.println(" Owner: " + getOwner_name()
                + "\n Car: " + getBrand() + " model: " + getModel() + " year: (" + getYear() + ")"
                + "\n Seating Capacity: " + seating_capacity);
    }

}
