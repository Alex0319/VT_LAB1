package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by user1 on 25.09.2016.
 */
public class Main {
    public static void main(String args[]) {
        try {
            int[] array=getInputArray();
            if(array!=null) {
                int[] primeNumberIndicesArray = searchPrimeNumberIndices(array);
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

    public static boolean checkPrime(int number) {
        if(number<=1)
            return false;
        double numberSqrt = Math.sqrt(number);
        for (int i = 2; i <= numberSqrt; i++)
            if (number % i == 0)
                return false;
        return true;
    }

    public static int[] searchPrimeNumberIndices(int[] array) {
        int arrayLength = array.length;
        List<Integer> primeNumberIndices = new ArrayList();
        for (int i = 0; i < arrayLength; i++)
            if (checkPrime(array[i]))
                primeNumberIndices.add(i);
        return convertListToArray(primeNumberIndices);
    }

    public static int[] convertListToArray(List<Integer> list) {
        int[] array=new int[list.size()];
        for(int i=0;i<list.size();i++)
            array[i]=list.get(i);
        return array;
    }
}