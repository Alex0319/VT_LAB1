package tests;

import shellSort.ShellSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user1 on 25.09.2016.
 */
public class TestClass {

    @Test
    public void shellSort_RandomArr(){
        double[] actualArray = {111,-5,7,43,3,0,123,2,-11,8};
        double[] expectedArray={-11,-5,0,2,3,7,8,43,111,123};
        Assert.assertArrayEquals(expectedArray,ShellSort.shellSort(actualArray),0.1);
    }

    @Test
    public void shellSort_EmptyArr(){
        double[] actualArray = {};
        double[] expectedArray={};
        Assert.assertArrayEquals(expectedArray,ShellSort.shellSort(actualArray),0.1);
    }

    @Test
    public void shellSort_ArrOfDoubles(){
        double[] actualArray = {1.23,-2.65,4.25,1.11,1.111,-0.21,0.15};
        double[] expectedArray={-2.65,-0.21,0.15,1.11,1.111,1.23,4.25};
        Assert.assertArrayEquals(expectedArray,ShellSort.shellSort(actualArray),0.1);
    }
}