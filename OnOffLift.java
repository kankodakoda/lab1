class OnOffLift implements RampAbility {

    private boolean rampRaised;

    public OnOffLift() {
        rampRaised = false;
    }

    public boolean getRampRaised() {
        return rampRaised;
    }

    @Override
    public void raiseRamp() {
        rampRaised = true;
    }

    @Override
    public void lowerRamp() {
        rampRaised = false;
    }

}