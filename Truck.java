import java.awt.*;
import java.util.*;

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

    public void raiseRamp() {
        if (currentSpeed == 0)
            rampAbility.raiseRamp();
        else
            System.out.println("Truck must be standing still");
    }

    public void lowerRamp() {
        rampAbility.lowerRamp();
    }

    //TODO Bilverkstad med parametrisk polymorfism
    
    

}