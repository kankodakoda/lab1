import java.awt.Color;
import java.util.Stack;

public class Mercedes extends Truck implements Loadable {

    private boolean rampRaised;
    private final int loadSize;
    private final Stack<Car> loadedCars;

    public Mercedes(double xPosition, double yPosition) {
        super("Mercedes", 2, 90, Color.cyan, xPosition, yPosition, new OnOffLift());

        rampRaised = false;
        loadedCars = new Stack<Car>();
        loadSize = 20;
    }

    @Override
    public void raiseRamp() {
        rampRaised = true;
    }

    @Override
    public void lowerRamp() {
        rampRaised = false;
    }

    @Override
    public void gas(double amount) {
        if (amount < 0 || amount > 1) {
            System.out.println("Ogiltigt värde");
            return; // Stoppar metoden från att fortsätta
        }
        if (rampRaised)
            return;
        else
            incrementSpeed(amount);
    }

    // TODO move function to get X and Y position of truck
    // TODO make sure the cars loaded have the same X, Y positions as the truck

    @Override
    public void loadCar(Car car) {
        if (!rampRaised) {
            System.out.println("cant load ramp is down ");
            return;
        }
        if (loadSize >= loadSize) {
            System.out.println("truck full");
            return;
        }

        loadedCars.push(car);

    }

    @Override
    public void unloadCar(Car car) {
        if (!loadedCars.empty())
            loadedCars.pop();
        else
            System.out.println("No cars in truck");
        return;

    }

}
