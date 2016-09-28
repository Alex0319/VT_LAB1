package main;

import shellSort.ShellSort;

import java.util.Scanner;

/**
 * Created by user1 on 27.09.2016.
 */
public class Main {
    public static void main(String args[]) {
        try {
            double[] array = getInputArray();
            if (array != null)
                printResult(ShellSort.shellSort(array));
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
        }
        return array;
    }

    public static void printResult(double[] array){
        int arrayLength=array.length;
        for(int i=0;i<arrayLength;i++)
            System.out.printf("%.2f ",array[i]);
    }
}