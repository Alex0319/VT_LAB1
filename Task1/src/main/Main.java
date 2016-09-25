package main;

import java.util.Scanner;

/**
 * Created by user1 on 18.09.2016.
 */
public class Main {

    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        try{
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            System.out.printf("Result: %f", calculateValue(x,y));
        }
        catch (Exception exc){
            System.out.printf("Incorrect input data");
        }
    }


    public static double calculateValue(double x, double y) {
        double tempValue1=raiseToSecondPower(Math.sin(x+y))+1;
        double tempValue2=2+Math.abs(x-2*x/(1+raiseToSecondPower(x*y)));
        return tempValue1/tempValue2+x;
    }

    public static double raiseToSecondPower(double value) {
        return value*value;
    }
}
