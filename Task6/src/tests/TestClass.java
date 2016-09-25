package tests;

import main.Main;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user1 on 25.09.2016.
 */
public class TestClass {

    @Test
    public void buildSquareMatrix_RandomArr(){
        int[] sourceArray={-5,0,12,10,4};
        int[][] actualSquareMatrix = {{-5,0,12,10,4},{0,12,10,4,-5},{12,10,4,-5,0},{10,4,-5,0,12},{4,-5,0,12,10}};
        Assert.assertArrayEquals(actualSquareMatrix,Main.buildSquareMatrixFromArray(sourceArray));
    }

    @Test
    public void buildSquareMatrix_EmptyArr(){
        int[] sourceArray={};
        int[][] actualSquareMatrix = {};
        Assert.assertArrayEquals(actualSquareMatrix,Main.buildSquareMatrixFromArray(sourceArray));
    }

    @Test
    public void uildSquareMatrix_OneElemInArr(){
        int[] sourceArray={5};
        int[][] actualSquareMatrix = {{5}};
        Assert.assertArrayEquals(actualSquareMatrix,Main.buildSquareMatrixFromArray(sourceArray));
    }
}