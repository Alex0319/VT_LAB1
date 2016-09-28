package primeNumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user1 on 27.09.2016.
 */
public class PrimeNumbersClass {
    private static boolean checkPrime(int number) {
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

    private static int[] convertListToArray(List<Integer> list) {
        int[] array=new int[list.size()];
        for(int i=0;i<list.size();i++)
            array[i]=list.get(i);
        return array;
    }
}
