package handler;

/**
 * Created by user1 on 27.09.2016.
 */
public class HandlerClass {
    public static int findMinCountElemToAbort(int[] array){
        int arrayLength=array.length;
        int[] arrayOfLengthIncreasingSubsequence=new int[arrayLength];
        for(int i=0;i<arrayLength;i++){
            arrayOfLengthIncreasingSubsequence[i]=1;
            for(int j=0;j<i;j++)
                if(array[i]>array[j])
                    arrayOfLengthIncreasingSubsequence[i]=Math.max(arrayOfLengthIncreasingSubsequence[i],1+arrayOfLengthIncreasingSubsequence[j]);
        }
        int result=(arrayLength>0? arrayOfLengthIncreasingSubsequence[0]:0);
        for(int i=0;i<arrayLength;i++)
            result=Math.max(result,arrayOfLengthIncreasingSubsequence[i]);
        return arrayLength-result;
    }
}
