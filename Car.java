import java.awt.*;

public abstract class Car implements Movable{
    //Some variables
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name
    protected double xPosition;
    protected double yPosition;
    protected double directionAngle;

    public Car(String modelName, int nrDoors, double enginePower, Color color, double xPosition, double yPosition) {
        this.modelName = modelName;
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        currentSpeed = 0;
        directionAngle = 0;
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

    public double getXPosition() {
        return xPosition;
    }

    public double getYPosition() {
        return yPosition;
    }

    public abstract double speedFactor();

    public abstract void incrementSpeed(double amount);
    
    public abstract void decrementSpeed(double amount);

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
        double movementX;
        double movementY;

        movementX = Math.cos(directionAngle) * speedFactor();
        movementY = Math.sin(directionAngle) * speedFactor();

        xPosition += movementX;
        yPosition += movementY;
        
    }

    @Override
    public void turnLeft(double amount) {
        directionAngle = Math.toRadians(directionAngle);
        amount = Math.toRadians(amount);

        if (amount >= 0) {
            directionAngle += amount;
            if (directionAngle >= 2 * Math.PI) {
                directionAngle -= 2 * Math.PI;
            } 
            directionAngle = Math.toDegrees(directionAngle);
        }
        
        else{
            System.out.println("Invalid");
        }
    }

    @Override
    public void turnRight(double amount) {
        directionAngle = Math.toRadians(directionAngle);
        amount = Math.toRadians(amount);
        
          if (amount >= 0) {
            directionAngle -= amount;
            if (directionAngle <= 2 * Math.PI) {
                directionAngle += 2 * Math.PI;
            }
            directionAngle = Math.toDegrees(directionAngle);
        }
    }
}

