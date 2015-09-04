package euler;

import eulerfm.Problem;

/**
 * Created by alexandrubostan on 17.08.2014.
 */
public class P06 extends Problem<Integer> {

    @Override
    public String getName() {
        return "Problem 6";
    }

    @Override
    public void run() {
        int sum = 0, sum1= 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
            sum1 += i;
        }
        result = sum1 * sum1 - sum;
    }
}
