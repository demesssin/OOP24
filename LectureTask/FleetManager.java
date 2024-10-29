package LectureTask;

import java.io.*;
import java.util.Vector;

public class FleetManager {
    private Vector<Vehicle> vehicles;

    public FleetManager() {
        vehicles = new Vector<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void saveVehiclesToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Vehicle vehicle : vehicles) {
                writer.write(vehicle.getType() + "," + vehicle.getBrand() + "," + vehicle.getModel() + "," + vehicle.getYear() + "," + vehicle.getPrice());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    public void loadVehiclesFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader("veh.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String type = parts[0];
                String brand = parts[1];
                String model = parts[2];
                int year = Integer.parseInt(parts[3]);
                double price = Double.parseDouble(parts[4]);

                switch (type) {
                    case "Car":
                        vehicles.add(new Car(brand, model, year, price));
                        break;
                    case "Truck":
                        vehicles.add(new Truck(brand, model, year, price));
                        break;
                    case "Motorcycle":
                        vehicles.add(new Motorcycle(brand, model, year, price));
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     */

    public void displayVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
