import static org.junit.Assert.*;

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
        assertEquals(4, volvo.nrDoors);
        assertEquals(100.0, volvo.enginePower, 0.001);
        assertEquals(Color.black, volvo.color);
    }

    // Volvo tests
    @Test
    public void checkVolovoTrimFactor() {
        assertEquals(1.25, Volvo240.trimFactor, 0.001);
    }

    @Test
    public void testVolvoGas() {
        double previousSpeed = volvo.getCurrentSpeed();
        volvo.gas(1);
        assertTrue(volvo.getCurrentSpeed() > previousSpeed);
    }

    @Test
    public void testVolvoBrake() {
        volvo.gas(1);
        double previousSpeed = volvo.getCurrentSpeed();
        volvo.brake(1);
        assertTrue(volvo.getCurrentSpeed() < previousSpeed);
    }

    // Saab tests
    @Test
    public void testTurboOn() {
        Saab95 saab2 = new Saab95(20, 20);
        saab2.setTurboOn();
        assertTrue(saab2.getTurboOn());
    }

    @Test
    public void testTurboOff() {
        Saab95 saab2 = new Saab95(20, 20);
        saab2.setTurboOff();
        assertFalse(saab2.getTurboOn());
    }

    @Test
    public void testSaabGas() {
        double previousSpeed = saab.getCurrentSpeed();
        saab.gas(1);
        assertTrue(saab.getCurrentSpeed() > previousSpeed);
    }

    @Test
    public void testSaabBrake() {
        saab.gas(1);
        double previousSpeed = saab.getCurrentSpeed();
        saab.brake(1);
        assertTrue(saab.getCurrentSpeed() < previousSpeed);
    }

    // Car tests
    @Test
    public void testMovement() {
        saab.turnLeft(10);

        saab.move();
        assertNotEquals(50, saab.getXPosition(), 0.001);
        assertNotEquals(50, saab.getYPosition(), 0.001);
    }

    @Test
    public void testTurnRight() {
        volvo.turnRight(10);
        assertEquals(80, volvo.getdirectionAngle(), 0.001);
    }

    @Test
    public void testTurnLeft() {
        volvo.turnLeft(10);
        assertEquals(100, volvo.getdirectionAngle(), 0.001);
    }

    @Test
    public void testMove() {
        double previousXPos = volvo.getXPosition();
        double previousYPos = volvo.getYPosition();

        volvo.turnRight(10);
        volvo.move();

        assertTrue(volvo.getXPosition() > previousXPos);
        assertTrue(volvo.getYPosition() > previousYPos);
    }
}
