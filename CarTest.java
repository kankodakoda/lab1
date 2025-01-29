import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.awt.Color;

import org.junit.*;

public class CarTest {
    
    private Car saab;
    private Car volvo;

    @Before
    public void setUp() {
        saab = new Saab95(50, 50);
        volvo = new Volvo240(20, 20);
    }

    @Test
    public void checkAttributes() {
        assertEquals("Saab95", saab.modelName);
        assertEquals(2, saab.nrDoors);
        assertEquals(125.0, saab.enginePower, 0.001);
        assertEquals(Color.red, saab.color);
        assertEquals("Volvo240", volvo.modelName);
        assertEquals(4,volvo.nrDoors);
        assertEquals(100.0,volvo.enginePower, 0.001);
        assertEquals(Color.black,volvo.color);  
    }

    @Test
    public void checkMovement() {
        saab.turnLeft(10);
        saab.move();
        assertNotEquals(50, saab.getXPosition(), 0.001);
        assertNotEquals(50, saab.getYPosition(), 0.001);
    }
}
