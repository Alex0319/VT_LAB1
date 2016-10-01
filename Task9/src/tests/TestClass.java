package tests;

import service.BasketServices;
import objects.Ball;
import objects.Basket;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user1 on 28.09.2016.
 */
public class TestClass {

    @Test
    public void findWeightOf5Balls_Returned350(){
        Basket basket=new Basket();
        BasketServices basketServices=new BasketServices();
        basket.putBall(new Ball("Blue",60));
        basket.putBall(new Ball("Red",80));
        basket.putBall(new Ball("Green",70));
        basket.putBall(new Ball("Black",90));
        basket.putBall(new Ball("Yellow",50));
        Assert.assertEquals(350,basketServices.getWeightBalls(basket));
    }

    @Test
    public void findCountOfBlueBallsOf6Balls_Returned3(){
        Basket basket=new Basket();
        BasketServices basketServices=new BasketServices();
        basket.putBall(new Ball("Blue",85));
        basket.putBall(new Ball("Red",80));
        basket.putBall(new Ball("Blue",90));
        basket.putBall(new Ball("Black",110));
        basket.putBall(new Ball("Yellow",150));
        basket.putBall(new Ball("Blue",100));
        Assert.assertEquals(3,basketServices.getCountOfBlueBalls(basket));
    }
}
