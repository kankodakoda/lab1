import java.awt.*;

public class Scania extends Truck {

    private double rampAngle;
    private boolean rampDown;
    private double rampXPos;
    private double rampYPos;

    public Scania(String modelName, int nrDoors, double enginePower, Color color, double xPosition, double yPosition) {
        super("Scania", 2, 90, Color.magenta, xPosition, yPosition, new AngularLift());
        rampAngle = 0;
        rampDown = false;

    }

    public boolean getRampDown() {
        return rampDown;
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
    public double speedFactor() {

        return enginePower * 0.01;
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

}