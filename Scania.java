import java.awt.*;

public class Scania extends Truck {
    
    private double rampAngle;
    private boolean rampDown;
    private double rampXPos;
    private double rampYPos;
    
    
    public Scania(String modelName, int nrDoors, double enginePower, Color color, double xPosition, double yPosition) {
        super("Scania", 2, 90, Color.magenta, xPosition, yPosition, new AngularLift());
        rampAngle = 0;
        rampDown = false;
        
    }
    
    public boolean getRampDown(){
        return rampDown;
    }
    public double getrampAngle(){
        return rampAngle;
    }
    

    public void raiseRamp(double amount){
        if(getrampAngle()>0){
            System.out.println("Cant raise while moving");
            return;
        
        }
        rampAngle=Math.min(rampAngle+ amount, 70);

    }

    public void lowerRamp(){
        if(getrampAngle() >0){
            System.out.println("cant lomer while moving");
            return; 
        }
        rampAngle=Math.max( rampAngle + amount, 0);
    }

    
    @Override
    public double speedFactor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'speedFactor'");
    }

}