package main;

import java.util.Scanner;

/**
 * Created by user1 on 23.09.2016.
 */
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        try{
            double initialCoordinate = scanner.nextDouble();
            double endCoordinate = scanner.nextDouble();
            double step=scanner.nextDouble();
            if(checkCoordinates(initialCoordinate,endCoordinate,step))
                calculateAndOutputResults(initialCoordinate,endCoordinate,step);
        }
        catch(Exception exc){
            System.out.printf("Incorrect data input");
        }
    }

    public static void calculateAndOutputResults(double initialCoordinate,double endCoordinate,double step){
        System.out.printf("%7s%12s\n","x","F(x)");
        for(double i=initialCoordinate;i<=endCoordinate+step;i+=step)
            System.out.printf("%10.5f%10.5f\n",i,calculateTg(i));
    }

    public static double calculateTg(double value)
    {
        return Math.tan(value);
    }

    public static boolean checkCoordinates(double initialCoordinate,double endCoordinate,double step){
        if(initialCoordinate>=endCoordinate){
            System.out.println("Initial coordinate must be lower to the end coordinate");
            return false;
        }
        if(step>endCoordinate-initialCoordinate){
            System.out.println("Step must be lower or equal to the length of interval");
            return false;
        }
        return true;
    }
}
