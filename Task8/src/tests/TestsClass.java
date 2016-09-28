package tests;

import handler.Handler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user1 on 27.09.2016.
 */
public class TestsClass {
    @Test
    public void findIndicesToInsertInFirstSequence_RandomSequences(){
        double[] destSequence = {-10,-5,7,43,123};
        double[] sourceSequence={-11,-3,0,2,3,8,19};
        int[] indicesToInsert={0,2,2,2,2,3,3};
        Assert.assertArrayEquals(indicesToInsert, Handler.findIndicesToInsertInFirstSequence(destSequence,sourceSequence));
    }

    @Test
    public void findIndicesToInsertInFirstSequence_EmptyFirstSequence(){
        double[] destSequence = {};
        double[] sourceSequence={-11,-3,0,2,3,8,19};
        int[] indicesToInsert={0,0,0,0,0,0,0};
        Assert.assertArrayEquals(indicesToInsert, Handler.findIndicesToInsertInFirstSequence(destSequence,sourceSequence));
    }

    @Test
    public void findIndicesToInsertInFirstSequence_EmptySecondSequence(){
        double[] destSequence = {1,3,5,8,19};
        double[] sourceSequence={};
        int[] indicesToInsert={};
        Assert.assertArrayEquals(indicesToInsert, Handler.findIndicesToInsertInFirstSequence(destSequence,sourceSequence));
    }

    @Test
    public void sindIndicesToInsertInFirstSequence_DoubleSequences(){
        double[] destSequence = {-8.54,-2.11,-1.99,0,1.23,5.34};
        double[] sourceSequence={-9.01,-4.78,-1.23,0.8,3,5.36,7};
        int[] indicesToInsert={0,1,3,4,5,6,6};
        Assert.assertArrayEquals(indicesToInsert, Handler.findIndicesToInsertInFirstSequence(destSequence,sourceSequence));
    }
}
