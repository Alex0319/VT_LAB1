package tests;

import main.Main;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user1 on 25.09.2016.
 */
public class TestClass {

    @Test
    public void findMinCountElem_RandomArr_4Returned(){
        int[] actualArrayOfNumbers = {111,5,7,43,3,0,123,2,11,8};
        Assert.assertEquals(6,Main.findMinCountElemToAbort(actualArrayOfNumbers));
    }

    @Test
    public void findMinCountElem_EmptyArr_0Returned(){
        int[] actualArrayOfNumbers = {};
        Assert.assertEquals(0,Main.findMinCountElemToAbort(actualArrayOfNumbers));
    }

    @Test
    public void findMinCountElem_OneElemInArr_0Returned(){
        int[] actualArrayOfNumbers = {5};
        Assert.assertEquals(0,Main.findMinCountElemToAbort(actualArrayOfNumbers));
    }
}
