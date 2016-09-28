package handler;

/**
 * Created by user1 on 27.09.2016.
 */
public class Handler {
    public static int[] findIndicesToInsertInFirstSequence(double[] destSequence,double[] sourceSequence){
        int sourceSequenceLength=sourceSequence.length,destSequenceLength=destSequence.length;
        int sourceSequenceIndex=0,destSequenceIndex=0;
        int[] indicesToInsert=new int[sourceSequenceLength];
        while(sourceSequenceIndex<sourceSequenceLength){
            while(destSequenceIndex<destSequenceLength && destSequence[destSequenceIndex]<sourceSequence[sourceSequenceIndex])
                destSequenceIndex++;
            indicesToInsert[sourceSequenceIndex]=destSequenceIndex;
            sourceSequenceIndex++;
        }
        return indicesToInsert;
    }
}
