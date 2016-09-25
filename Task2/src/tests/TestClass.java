package tests;

import main.Main;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user1 on 23.09.2016.
 */
public class TestClass {
    @Test
    public void checkPointWithCoordinates5and6() {
        Assert.assertFalse(Main.determineIsPointInRegion(5,6));
    }

    @Test
    public void checkPointWithCoordinatesNeg3Dot999and5() {
        Assert.assertTrue(Main.determineIsPointInRegion(-3.999,5));
    }

    @Test
    public void checkPointWithCoordinates5Dot9999999and0Dot00001() {
        Assert.assertFalse(Main.determineIsPointInRegion(5.9999999,0.00001));
    }
}
