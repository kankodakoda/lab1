import java.util.ArrayList;

public class Workshop<T extends Car> {
    private final int capacity; // Max antal bilar verkstaden kan ta
    private final ArrayList<T> vehicles; // Lista för att lagra fordon

    public Workshop(int capacity) {
        this.capacity = capacity;
        this.vehicles = new ArrayList<T>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<T> getVehicles() {
        return vehicles;
    }

    // Lägg till ett fordon i verkstaden
    public void addVehicle(T vehicle) {
        if (vehicles.size() < capacity) {
            vehicles.add(vehicle);
            System.out.println(vehicle + " added to the workshop.");
        } else {
            System.out.println("Workshop is full. " + vehicle);
        }
    }

    // Ta bort ett fordon från verkstaden
    public T removeVehicle() { // Referenser
        if (!vehicles.isEmpty()) {
            T vehicle = vehicles.remove(vehicles.size() - 1);
            System.out.println(vehicle.toString() + " removed from the workshop.");
            return vehicle;
        } else {
            System.out.println("No vehicles in the workshop.");
            return null;
        }
    }

    // Visa alla fordon i verkstaden
    public void listVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles in the workshop.");
        } else {
            System.out.println("Vehicles in the workshop:");
            for (T vehicle : vehicles) {
                System.out.println("- " + vehicle);
            }
        }
    }

    public int countVehicles(){
        return vehicles.size();
    }

}
