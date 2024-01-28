package vehicle_management_system;
import java.util.Scanner;

public class Vehicle_Management_System {

    public static void main(String[] args) {
        Garage garage = new Garage();
        Scanner input = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("Menu: ");
            System.out.println("1 : Add a vehicle");
            System.out.println("2 : Update a vehicle");
            System.out.println("3 : Remove a vehicle");
            System.out.println("4 : Display  vehicles");
            System.out.println("5 : Disply details of a vehicle");
            System.out.println("0 : Exit");

            System.out.println("Enter your choice : ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Choose the vehicle type :");
                    System.out.println("1 : Car");
                    System.out.println("2 : Motorcycle");
                    System.out.println("3 : Truck");

                    System.out.println("Enter the vehicle (1-3) : ");
                    int vehicleType = input.nextInt();

                    switch (vehicleType) {
                        case 1:
                            System.out.println("Enter owner name :");
                            String car_owner = input.next();
                            System.out.println("Enter vehicle brand :");
                            String car_brand = input.next();
                            System.out.println("Enter vehicle model :");
                            String car_model = input.next();
                            System.out.println("Enter vehicle year :");
                            int car_year = input.nextInt();
                            System.out.println("Enter seating capacity :");
                            int seating_capacity = input.nextInt();
                            garage.addVehicle(new Car(seating_capacity, car_owner, car_brand, car_model, car_year));
                            break;
                        case 2:
                            System.out.println("Enter owner name :");
                            String Motorcycle_owner = input.next();
                            System.out.println("Enter vehicle brand :");
                            String Motorcycle_brand = input.next();
                            System.out.println("Enter vehicle model :");
                            String Motorcycle_model = input.next();
                            System.out.println("Enter vehicle year :");
                            int Motorcycle_year = input.nextInt();
                            System.out.println("Enter engine size :");
                            int engine_size = input.nextInt();
                            garage.addVehicle(new Motorcycle(engine_size, Motorcycle_owner, Motorcycle_brand, Motorcycle_model, Motorcycle_year));
                            break;
                        case 3:
                            System.out.println("Enter owner name :");
                            String Truck_owner = input.next();
                            System.out.println("Enter vehicle brand :");
                            String Truck_brand = input.next();
                            System.out.println("Enter vehicle model :");
                            String Truck_model = input.next();
                            System.out.println("Enter vehicle year :");
                            int Truck_year = input.nextInt();
                            System.out.println("Enter cargo capacity :");
                            int cargo_capacity = input.nextInt();
                            garage.addVehicle(new Truck(cargo_capacity, Truck_owner, Truck_brand, Truck_model, Truck_year));
                            break;
                        default:
                            System.out.println("Invalid vehicle type choice. ");
                            break;
                    }

                case 2:
                    System.out.println(" Enter owner name of the vehicle to update: ");
                    String update_owner = input.nextLine();
                    System.out.println("Enter new owner name :");
                    String owner = input.next();
                    System.out.println("Enter new vehicle brand :");
                    String brand = input.next();
                    System.out.println("Enter new vehicle model :");
                    String model = input.next();
                    System.out.println("Enter new vehicle year :");
                    int year = input.nextInt();
                    garage.updateVehicle(brand, model, year,owner, update_owner);
                    break;

                case 3:
                    System.out.println(" Enter owner name of the vehicle to remove: ");
                    String remove_owner = input.nextLine();
                    garage.removeVehicle(remove_owner);
                    break;

                case 4:
                    garage.displayVehicles();
                    break;

                case 5:
                    System.out.println(" Enter owner name of the vehicle to disply details : ");
                    String display_owner = input.nextLine();
                    garage.displayVehiclesDetails(display_owner);
                    break;

                case 0:
                    System.out.println(" Exiting the program. goodbye :>");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Pleas a valid option.>");

            }

        } while (choice != 0);

    }

}
