import java.awt.*;

public class Saab95 extends Car{

    private boolean turboOn;

    public Saab95(Point pos){
        super("Saab95", 2, 125, Color.red, pos);
	    turboOn = false;
    }

    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }
    
    @Override
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    @Override
    public void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    @Override
    public void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }
    
    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

    @Override
    public void turnLeft() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turnLeft'");
    }

    @Override
    public void turnRight() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turnRight'");
    }
}
