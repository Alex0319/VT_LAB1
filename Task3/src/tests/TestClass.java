package tests;


import main.Main;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user1 on 23.09.2016.
 */
public class TestClass {

    @Test
    public void checkIntervalWithCoordinates3And5AndStep0Dot2(){
        double[] tgValuesArray = {-0.1425,0.0584,0.2643, 0.4934,0.7735,1.1578,1.7777, 3.0963,8.8601,-11.3848,-3.3805};
        double[] actualValues=new double[tgValuesArray.length];
        int j=0;
        for(double i=3;i<=5+0.2;i+=0.2)
            actualValues[j++]=Main.calculateTg(i);
        Assert.assertArrayEquals(tgValuesArray,actualValues,0.0001);
    }
}
