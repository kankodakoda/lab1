import java.awt.*;

public class Saab95 extends Car {

    private boolean turboOn;

    public Saab95(double xpos, double ypos) {
        super("Saab95", 2, 125, Color.red, xpos, ypos);
        turboOn = false;
    }

    public boolean getTurboOn() {
        return turboOn;
    }

    public void setTurboOn() {
        turboOn = true;
    }

    public void setTurboOff() {
        turboOn = false;
    }

    @Override
    public double speedFactor() {
        double turbo = 1;
        if (turboOn)
            turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    @Override
    public void incrementSpeed(double amount) {
        if (getCurrentSpeed() + speedFactor() * amount > enginePower)
            System.out.println("Current speed can't be higher than engine power");
        else
            currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    @Override
    public void decrementSpeed(double amount) {
        if (getCurrentSpeed() - speedFactor() * amount < 0)
            System.out.println("Current speed can't be lower than 0");
        else
            currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }

}
