package euler;

import eulerfm.Problem;

import java.math.BigInteger;

/**
 * Created by alexandrubostan on 24.08.2014.
 */
public class P10 extends Problem<BigInteger> {
    @Override
    public String getName() {
        return "Problem 10";
    }

    @Override
    public void run() {
        BigInteger sum = BigInteger.ZERO;
        for (BigInteger num = BigInteger.valueOf(2); num.compareTo(BigInteger.valueOf(1000000)) < 0; num = num.nextProbablePrime()) {
            sum = sum.add(num);
        }
        result = sum;
    }
}
