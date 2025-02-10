import java.awt.*;

public class Scania extends Truck {

    private double rampAngle;

    public Scania(double xPosition, double yPosition) {
        super("Scania", 2, 90, Color.magenta, xPosition, yPosition, new AngularLift());
        rampAngle = 0;

    }

    public double getrampAngle() {
        return rampAngle;
    }

    public void raiseRamp(double amount) {
        if (getrampAngle() > 0) {
            System.out.println("Cant raise while moving");
            return;

        }
        rampAngle = Math.min(rampAngle + amount, 70);

    }

    public void lowerRamp(double amount) {
        if (getrampAngle() > 0) {
            System.out.println("cant lower while moving");
            return;
        }
        rampAngle = Math.max(rampAngle + amount, 0);
    }

    @Override
    public void gas(double amount) {
        if (amount < 0 || amount > 1) {
            System.out.println("Ogiltigt värde");
            return; // Stoppar metoden från att fortsätta
        }
        if (rampAngle == 0)
            incrementSpeed(amount);
        else
            return;

    }

    // TODO move function to get X and Y position of truck

}