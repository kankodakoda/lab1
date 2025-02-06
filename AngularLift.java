class AngularLift implements RampAbility {

    private double rampAngle;

    public AngularLift() {
        rampAngle = 0;

    }

    @Override
    public void raiseRamp(double amount) {
        // Can raise ramp up to 70 degrees.
        // Can only move while car in not moving
        if (amount <= 0) 
            return;
        if(rampAngle - amount < 0){
            System.out.println("Ramp can't be raised anymore");
        }
        else
            rampAngle -= amount;
    }    

    @Override
    public void lowerRamp(double amount) {
        if (amount <= 0)
            return;
        if (amount + rampAngle > 70) {
            System.out.println("Ramp can't be lowered anymore");
        }
        else
            rampAngle += amount;
        // Lower ramp down to 0 degrees
        // Can only move while car is not moving
        
    }
}
