class AngularLift implements RampAbility {
    private double rampAngle;

    public AngularLift() {
        rampAngle = 0;
    }

    public double getRampAngle() {
        return rampAngle;
    }

    public void raiseRamp(double amount) {
        // Raise ramp by amount degrees
        if (amount <= 0)
            return;
        if (rampAngle - amount < 0)
            System.out.println("Ramp can't be raised anymore");
        else
            rampAngle -= amount;
    }

    public void lowerRamp(double amount) {
        // Lower ramp by amount degrees
        if (amount <= 0)
            return;
        if (amount + rampAngle > 70)
            System.out.println("Ramp can't be lowered anymore");
        else
            rampAngle += amount;

    }

    @Override
    public void raiseRamp() {
        // Fully raises ramp to 70 degrees
        rampAngle = 70;
    }

    @Override
    public void lowerRamp() {
        // Fully lowers ramp to 0 degrees
        rampAngle = 0;
    }
}
