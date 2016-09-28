package tests;

import calculateByFormul.CalculateClass;
import org.junit.Assert;
import org.junit.Test;
import main.Main;
/**
 * Created by user1 on 22.09.2016.
 */

public class TestClass {
    @Test
    public void calculateByFormul_5and10_return5dot2(){
        Assert.assertEquals(5.2,CalculateClass.calculateValue(5,10),0.1);
    }

    @Test
    public void calculateByFormul_neg3and4_returnNeg2dot65(){
        Assert.assertEquals(-2.65,CalculateClass.calculateValue(-3,4),0.1);
    }
}
