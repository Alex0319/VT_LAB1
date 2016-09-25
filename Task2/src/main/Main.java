package main;

import java.util.Scanner;

/**
 * Created by user1 on 22.09.2016.
 */
public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        try{
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            System.out.printf("Result: %b", determineIsPointInRegion(x,y));
        }
        catch(Exception exc){
            System.out.printf("Incorrect data input");
        }
    }

    public static boolean determineIsPointInRegion(double x,double y){
        if((y<0 && y>=-3 && Math.abs(x)<=6)||(y<=5 && y>=0 && Math.abs(x)<=4))
            return true;
        return false;
    }
}