package main;

import calculateByFormul.CalculateClass;

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
            System.out.printf("Result: %f", CalculateClass.calculateValue(x,y));
        }
        catch (Exception exc){
            System.out.printf("Incorrect input data");
        }
    }
}
