package objects;

import java.util.ArrayList;

/**
 * Created by user1 on 30.09.2016.
 */
public class Basket {
    public ArrayList<Ball> ballsInBasket;

    public Basket(){
        ballsInBasket=new ArrayList<Ball>();
    }

    public void putBall(Ball ball){
        ballsInBasket.add(ball);
    }
}