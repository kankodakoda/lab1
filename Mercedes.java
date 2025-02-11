import java.awt.Color;
import java.util.Stack;

public class Mercedes extends Truck implements Loadable {

    private final int loadSize;
    private final Stack<Car> loadedCars;

    public Mercedes(double xPosition, double yPosition) {
        super("Mercedes", 2, 90, Color.cyan, xPosition, yPosition, new OnOffLift());

        loadedCars = new Stack<Car>();
        loadSize = 20;
    }

    public Stack<Car>getLoadedCars() {
        return loadedCars;
    }

    public int getVehicleCount() {
        return loadedCars.size();
    }

    @Override
    public void gas(double amount) {
        // Increase velocity of Mercedes
        if (amount < 0 || amount > 1) {
            System.out.println("Ogiltigt värde");
            return; // Stoppar metoden från att fortsätta
        }
        incrementSpeed(amount);
    }

    @Override
    public void loadCar(Car car) {
        // Loads a car onto the Mercedes
        if (isRaised()) {
            System.out.println("cant load ramp is down ");
            return;
        }
        else if (car.getModelName() == "Mercedes"){
            System.out.println("Can't load car transportation");
            return;
        }
        else if (getVehicleCount() >= loadSize) {
            System.out.println("truck full");
            return;
        }
        // TODO: Fix closeness between car and ramp
        loadedCars.push(car);

    }

    @Override
    public void unloadCar(Car car) {
        // Removes car from truck
        if (!loadedCars.empty())
            loadedCars.pop();
        else
            System.out.println("No cars in truck");
        return;

    }

}
