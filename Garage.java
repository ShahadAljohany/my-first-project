package vehicle_management_system;

import java.util.ArrayList;

public class Garage {

    private Vehicle[] Vehicles;
    private int count;

    // Constructor to initialize the list of vehicles in the garage
    public Garage() {
        this.Vehicles = new Vehicle[100];
        this.count = 0;
    }

    // Method to add a vehicle to the garage
    public void addVehicle(Vehicle Vehicle) {
        if (count < Vehicles.length) {
            Vehicles[count] = Vehicle;
            count++;
            System.out.println("Vehicle added to the garag .>");
        } else {
            System.out.println("Garage is full. can not add more Vehicles .>");
        }

    }
    // Method to Update a vehicle from the garage

    public void updateVehicle(String brand, String model, int year, String owner, String update_owner) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (Vehicles[i].getOwner_name().equalsIgnoreCase(update_owner)) {
                Vehicles[i].setBrand(brand);
                Vehicles[i].setModel(model);
                Vehicles[i].setYear(year);
                Vehicles[i].setOwner_name(owner);
                System.out.println("Vehicle Update successfully .>");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Vehicle with owner ' " + update_owner + " ' not found. update failed .>");

        }

    }

    // Method to remove a vehicle from the garage
    public void removeVehicle(String remove_owner) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (Vehicles[i].getOwner_name().equalsIgnoreCase(remove_owner)) {
                Vehicles[i] = Vehicles[count - 1];
                Vehicles[count - 1] = null;
                count--;
                System.out.println("Vehicle remove successfully .>");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Vehicle with owner ' " + remove_owner + " ' not found. removal failed .>");

        }

    }

    // Method to print  vehicles in the garage
    public void displayVehicles() {
        if (count == 0) {
            System.out.println("The garage is empty !");

        } else {
            for (int i = 0; i < count; i++) {
                Vehicles[i].display();
                System.out.println();
            }
        }
    }
    // Method to display Vehicles Details in the garage

    public void displayVehiclesDetails(String display_owner) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (Vehicles[i].getOwner_name().equalsIgnoreCase(display_owner)) {
                Vehicles[i].display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Vehicle with owner ' " + display_owner + " ' not found .>");

        }
    }

}
