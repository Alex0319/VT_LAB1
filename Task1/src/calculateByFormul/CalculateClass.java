package calculateByFormul;

/**
 * Created by user1 on 27.09.2016.
 */
public class CalculateClass {
    public static double calculateValue(double x, double y) {
        double tempValue1=raiseToSecondPower(Math.sin(x+y))+1;
        double tempValue2=2+Math.abs(x-2*x/(1+raiseToSecondPower(x*y)));
        return tempValue1/tempValue2+x;
    }

    private static double raiseToSecondPower(double value) {
        return value*value;
    }

}
