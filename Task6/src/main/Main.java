package main;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by user1 on 25.09.2016.
 */
public class Main {
    public static void main(String args[]) {
        try {
            int[] array = getInputArray();
            if (array != null)
                printResultMatrix(buildSquareMatrixFromArray(array));
            else
                System.out.printf("Length of the array must be positive");
        } catch (Exception exc) {
            System.out.printf("Incorrect data input");
        }
    }

    public static int[] getInputArray() {
        int[] array = null;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input length of array: ");
        int length = scanner.nextInt();
        if (length > 0) {
            array = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.printf("%d element: ", i + 1);
                array[i] = scanner.nextInt();
            }
        }
        return array;
    }

    public static int[][] buildSquareMatrixFromArray(int[] array){
        int arrayLength=array.length;
        int[][] resultMatrix=new int[arrayLength][arrayLength];
        for(int i=0;i< arrayLength;i++)
            for(int j=0;j<arrayLength;j++)
                resultMatrix[i][j]=array[(j+i)%arrayLength];
        return resultMatrix;
    }

    public static void printResultMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++)
                System.out.printf("%d ",matrix[i][j]);
            System.out.print('\n');
        }
    }
}