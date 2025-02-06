class OnOffLift implements RampAbility {

    private boolean rampUp;

    public OnOffLift() {
        rampUp = false;
    }
    
    @Override
    public void raiseRamp() {
        rampUp = true;
    }

    @Override
    public void lowerRamp() {
        rampUp = false;
    }
    
}