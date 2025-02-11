import java.awt.*;

public abstract class Truck extends Car {
    private RampAbility rampAbility;

    public Truck(
            String modelName,
            int nrDoors,
            double enginePower,
            Color color,
            double xPosition,
            double yPosition,
            RampAbility rampAbility) {

        super(modelName, nrDoors, enginePower, color, xPosition, yPosition);
        this.rampAbility = rampAbility;
    }

    public RampAbility getRampAbility() {
        return rampAbility;
    }

    public boolean isRaised() {
        return rampAbility.isRaised();
    }

    public void raiseRamp() {
        // Raise ramp if truck is standing still
        if (currentSpeed == 0)
            rampAbility.raiseRamp();
        else
            System.out.println("Truck must be standing still");
    }

    public void lowerRamp() {
        rampAbility.lowerRamp();
    }

    @Override
    public double speedFactor() {
        return enginePower * 0.01;
    }

}