package LectureTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FleetManager fleetManager = new FleetManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. add Car");
            System.out.println("2. add Truck");
            System.out.println("3. add Motorcycle");
            System.out.println("4. save Vehicles to File");
            System.out.println("5. load Vehicles from File");
            System.out.println("6. display All Vehicles");
            System.out.println("0. exit");
            System.out.print("your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter brand: ");
                    String carBrand = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String carModel = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int carYear = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double carPrice = scanner.nextDouble();
                    fleetManager.addVehicle(new Car(carBrand, carModel, carYear, carPrice));
                    break;
                case 2:
                    System.out.print("Enter brand: ");
                    String truckBrand = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String truckModel = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int truckYear = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double truckPrice = scanner.nextDouble();
                    fleetManager.addVehicle(new Truck(truckBrand, truckModel, truckYear, truckPrice));
                    break;
                case 3:
                    System.out.print("Enter brand: ");
                    String motorcycleBrand = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String motorcycleModel = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int motorcycleYear = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double motorcyclePrice = scanner.nextDouble();
                    fleetManager.addVehicle(new Motorcycle(motorcycleBrand, motorcycleModel, motorcycleYear, motorcyclePrice));
                    break;
                case 4:
                    fleetManager.saveVehiclesToFile("veh.txt");
                    break;
                /*case 5:
                    fleetManager.loadVehiclesFromFile("vehicles.txt");
                    break;

                 */
                case 6:
                    fleetManager.displayVehicles();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
