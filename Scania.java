import java.awt.*;

public class Scania extends Truck {
    private AngularLift angularLift;

    public Scania(double xPosition, double yPosition) {
        super("Scania",
                2,
                90,
                Color.magenta,
                xPosition,
                yPosition,
                new AngularLift());

        this.angularLift = (AngularLift) getRampAbility();
    }

    public void raiseRamp(double amount) {
        // Use AngularLifts raise by amount function
        angularLift.raiseRamp(amount);
    }

    public void lowerRamp(double amount) {
        // Use AngularLifts lower by amount function
        angularLift.lowerRamp(amount);
    }

    @Override
    public void gas(double amount) {
        // Gas by amount
        if (amount < 0 || amount > 1) {
            System.out.println("Ogiltigt värde");
            return; // Stoppar metoden från att fortsätta
        } else
            return;

    }

}