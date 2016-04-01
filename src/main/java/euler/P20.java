package euler;

import eulerfm.Problem;
import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * @author Alex Bostan (alex.bostan@hostelworld.com)
 * @version $Id$
 * @since 1.0
 */
public class P20 extends Problem<BigInteger> {
    @Override
    public String getName() {
        return "Problem 20";
    }

    @Override
    public void run() {
        BigInteger n = factorial();
        BigInteger sum = BigInteger.ZERO;

        while (n.compareTo(BigInteger.ZERO) > 0) {
            sum = sum.add(n.mod(BigInteger.TEN));
            n = n.divide(BigInteger.TEN);
        }
        System.out.println(sum);
    }

    private static BigInteger factorial() {
        BigInteger f = BigInteger.ONE;
        for (int i = 1; i <= 100; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
