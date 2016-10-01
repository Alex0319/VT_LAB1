package main;

import objects.Ball;
import objects.Basket;
import service.BasketServices;

/**
 * Created by user1 on 30.09.2016.
 */
public class Main {
    public static void main(String args[]) {
        Basket basket=new Basket();
        BasketServices basketServices=new BasketServices();
        basket.putBall(new Ball("Blue",65));
        basket.putBall(new Ball("Red",80));
        basket.putBall(new Ball("Green",70));
        basket.putBall(new Ball("Black",90));
        basket.putBall(new Ball("Yellow",200));

        System.out.println("Count of blue balls in basket: "+basketServices.getCountOfBlueBalls(basket));
        System.out.println("Weight of balls in basket: "+basketServices.getWeightBalls(basket));
    }

}
