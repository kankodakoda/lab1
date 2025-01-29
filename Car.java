import java.awt.*;

public abstract class Car implements Movable{
    //Some variables
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name
    protected Point pos;
    protected String direction;

    public Car(String modelName, int nrDoors, double enginePower, Color color, Point pos) {
        this.modelName = modelName;
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.pos = pos;
        currentSpeed = 0;
        direction = "N";
    }

    public int getNrDoors(){
        return nrDoors;
    }
    
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
	    color = clr;
    }

    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }

    public abstract double speedFactor();

    public abstract void incrementSpeed(double amount);
    
    public abstract void decrementSpeed(double amount);

    protected String getDirection() {
        return "direction";
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

