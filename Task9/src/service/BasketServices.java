package service;

import objects.Ball;
import objects.Basket;

/**
 * Created by user1 on 30.09.2016.
 */
public class BasketServices {

    public int getWeightBalls(Basket basket) {
        int totalWeight=0;
        for(Ball currentBall:basket.ballsInBasket)
            totalWeight+=currentBall.weight;
        return totalWeight;
    }

    public int getCountOfBlueBalls(Basket basket){
        int countOfBlueBalls=0;
        for(Ball currentBall:basket.ballsInBasket)
            if(currentBall.color.compareTo("Blue")==0)
                countOfBlueBalls++;
        return countOfBlueBalls;
    }
}