import java.awt.*;

public abstract class Car implements Movable {

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
        directionAngle = 90;
    }

    public int getNrDoors() {
        return nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double speed) {
        if (speed <= enginePower && speed > 0)
            currentSpeed = speed;
    }

    public Color getColor() {
        return color;
    }

    public String getModelName() {
        return modelName;
    }

    public double getdirectionAngle() {
        return directionAngle;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    public double getXPosition() {
        return xPosition;
    }

    public double getYPosition() {
        return yPosition;
    }

    public abstract double speedFactor();

    protected abstract void incrementSpeed(double amount);

    protected abstract void decrementSpeed(double amount);

    public void gas(double amount) {
        if (amount < 0 || amount > 1) {
            System.out.println("Ogiltigt värde");
            return; // Stoppar metoden från att fortsätta
        }
        incrementSpeed(amount);
    }

    public void brake(double amount) {
        if (amount < 0 || amount > 1) {
            System.out.println("Not valid");
            return;
        }
        decrementSpeed(amount);
    }

    @Override
    public void move() {
        double movementX;
        double movementY;

        double directionAngleRadians = Math.toRadians(directionAngle);

        movementX = Math.cos(directionAngleRadians) * speedFactor();
        movementY = Math.sin(directionAngleRadians) * speedFactor();

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

        else {
            System.out.println("Invalid");
        }
    }

    @Override
    public void turnRight(double amount) {
        directionAngle = Math.toRadians(directionAngle);
        amount = Math.toRadians(amount);

        if (amount >= 0) {
            directionAngle -= amount;
            if (directionAngle < 0) {
                directionAngle += 2 * Math.PI;
            }
            directionAngle = Math.toDegrees(directionAngle);

        }
    }
}
