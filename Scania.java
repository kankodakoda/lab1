import java.awt.*;

public class Scania extends Truck {
   private double bedAngle; // Angle of the truck bed 

public double getBedAngle() {
        return bedAngle;
    }

    //Raises the truck bed by the given amount.The angle cannot exceed 70 degrees, and the truck must be stationary.

    public void raiseBed(double amount) {
        if (getCurrentSpeed() > 0) {
            System.out.println("Cannot raise while moving.");
            return;
        }
        bedAngle = Math.min(bedAngle + amount, 70);
    }

}
