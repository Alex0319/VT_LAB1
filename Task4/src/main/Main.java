package main;

import primeNumbers.PrimeNumbersClass;
import java.util.Scanner;

/**
 * Created by user1 on 25.09.2016.
 */
public class Main {
    public static void main(String args[]) {
        try {
            int[] array=getInputArray();
            if(array!=null) {
                int[] primeNumberIndicesArray = PrimeNumbersClass.searchPrimeNumberIndices(array);
                System.out.printf("Indices of prime numbers: ");
                for (int i = 0; i < primeNumberIndicesArray.length; i++)
                    System.out.printf("%d ", primeNumberIndicesArray[i] + 1);
            }
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
}