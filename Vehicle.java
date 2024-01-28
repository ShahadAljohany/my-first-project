package vehicle_management_system;

public abstract class Vehicle {

    private String owner_name;
    private String Brand;
    private String model;
    private int year;

    public Vehicle(String owner_name, String Brand, String model, int year) {
        this.owner_name = owner_name;
        this.Brand = Brand;
        this.model = model;
        this.year = year;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void display();

}
