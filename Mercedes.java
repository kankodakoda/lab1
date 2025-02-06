import java.awt.Color;
import java.util.ArrayList;

public class Mercedes extends Truck{

    protected int loadSize;
    protected final ArrayList<Car> loadedCars;

    public Mercedes(String modelName, int nrDoors, double enginePower, Color color, double xPosition, double yPosition,
            int loadSize) {
        super(modelName, nrDoors, enginePower, color, xPosition, yPosition, new OnOffLift());
        this.loadSize = loadSize;
        loadedCars = new ArrayList<>(loadSize);
    }

    @Override
    public void raiseRamp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'raiseRamp'");
    }
    @Override
    public void lowerRamp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lowerRamp'");
    }
    @Override
    public double speedFactor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'speedFactor'");
    }
}
