package main;

import handler.Handler;

import java.util.Scanner;

/**
 * Created by user1 on 27.09.2016.
 */
public class Main {
    public static void main(String args[]) {
        try {
            double[] destSequence = getInputArray();
            if (destSequence != null) {
                double[] sourceSequence = getInputArray();
                if(sourceSequence!=null)
                    printResult(Handler.findIndicesToInsertInFirstSequence(destSequence,sourceSequence),destSequence,sourceSequence);
                else
                    System.out.printf("Length of the array must be positive");
            }
            else
                System.out.printf("Length of the array must be positive");
        } catch (Exception exc) {
            System.out.printf("Incorrect data input");
        }
    }

    public static double[] getInputArray() {
        double[] array=null;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input length of array: ");
        int length = scanner.nextInt();
        if(length>0){
            array = new double[length];
            for (int i = 0; i < length; i++) {
                System.out.printf("%d element: ", i + 1);
                array[i] = scanner.nextDouble();
            }
            System.out.print('\n');
        }
        return array;
    }

    public static void printResult(int[] arrayOfIndices,double[] destArray,double[] sourceArray){
        int arrayLength=arrayOfIndices.length;
        System.out.printf("Places to insert:\n");
        for(int i=0;i<arrayLength;i++){
            if(arrayOfIndices[i]==0)
                System.out.printf("%.2f of second sequence before %.2f of first sequence\n",
                        sourceArray[i],destArray[arrayOfIndices[i]]);
            else if(arrayOfIndices[i]==destArray.length)
                System.out.printf("%.2f of second sequence after %.2f of first sequence\n",
                        sourceArray[i],destArray[arrayOfIndices[i]-1]);
            else System.out.printf("%.2f of second sequence between %.2f and %.2f of first sequence\n",
                    sourceArray[i],destArray[arrayOfIndices[i]-1],destArray[arrayOfIndices[i]]);
        }
    }
}
