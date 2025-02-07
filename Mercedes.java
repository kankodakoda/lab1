import java.awt.Color;
import java.util.Stack;

public class Mercedes extends Truck implements Loadable {

    private boolean rampRaised;
    private int loadSize;
    private final Stack<Car> loadedCars;
    private int maxCapacity;

    public Mercedes(String modelName, int nrDoors, double enginePower, Color color, double xPosition, double yPosition,
            int loadSize) {
        super(modelName, nrDoors, enginePower, color, xPosition, yPosition, new OnOffLift());

        rampRaised = false;
        this.loadSize = loadSize;
        loadedCars = new Stack<Car>();
        maxCapacity = 20;
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
    public double speedFactor() {
        return enginePower * 0.01;
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

    @Override
    public void loadCar(Car car) {
        if (!rampRaised) {
            System.out.println("cant load ramp is down ");
            return;
        }
        if (loadSize >= maxCapacity) {
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
