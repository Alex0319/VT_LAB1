package tests;

import org.junit.Assert;
import org.junit.Test;
import primeNumbers.PrimeNumbersClass;

/**
 * Created by user1 on 25.09.2016.
 */
public class TestClass {

    @Test
    public void searchPrimeNumberIndices(){
        int[] array={11,6,7,10,12,2,0,4,678};
        Assert.assertArrayEquals(new int[] {0,2,5}, PrimeNumbersClass.searchPrimeNumberIndices(array));
    }

    @Test
    public void searchPrimeNumberIndicesFromNegativeArrayNumbers(){
        int[] array={-11,-6,-2,-21,-1};
        Assert.assertArrayEquals(new int[] {},PrimeNumbersClass.searchPrimeNumberIndices(array));
    }
}
