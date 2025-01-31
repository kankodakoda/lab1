import java.awt.*;

public class Volvo240 extends Car {

    public final static double trimFactor = 1.25;

    public Volvo240(double xpos, double ypos) {
        super("Volvo240", 4, 100, Color.black, xpos, ypos);
    }

    @Override
    public double speedFactor() {
        return enginePower * 0.01 * trimFactor;
    }

    @Override
    public void incrementSpeed(double amount) {
        if (Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower) > enginePower)
            System.out.println("Current speed can't be higher than vehicles engine power");
        else
            currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
    }

    @Override
    public void decrementSpeed(double amount) {
        if (Math.max(getCurrentSpeed() - speedFactor() * amount, 0) < 0)
            System.out.println("Current speed can't be lower than 0");
        else
            currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }

}
