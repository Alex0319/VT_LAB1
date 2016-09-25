package main;

import java.util.Scanner;

/**
 * Created by user1 on 25.09.2016.
 */
public class Main {
    public static void main(String args[]) {
        try {
            int[] array=getInputArray();
            if(array!=null)
                System.out.printf("Min count of elements to abort: %d",findMinCountElemToAbort(array));
            else
                System.out.printf("Length of the array must be positive");
        } catch (Exception exc) {
            System.out.printf("Incorrect data input");
        }
    }

    public static int[] getInputArray() {
        int[] array=null;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input length of array: ");
        int length = scanner.nextInt();
        if(length>0){
            array = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.printf("%d element: ", i + 1);
                array[i] = scanner.nextInt();
            }
        }
        return array;
    }

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