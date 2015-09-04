package euler;

import eulerfm.Problem;

/**
 * Created by alexandrubostan on 06.08.2014.
 */
public class P03 extends Problem<Long> {


    @Override
    public String getName() {
        return "Problem 03";
    }

    @Override
    public void run() {
        result = calculate();
    }

    private long calculate() {
        long n = 600851475143L;
        while (true) {
            long p = smallestFactor(n);
            if (p < n)
                n /= p;
            else return result = n;
        }

    }

    private static long smallestFactor(long n) {
        for (long i = 2, end = (long) Math.sqrt(n); i <= end; i++) {
            if (n % i == 0)
                return i;
        }
        return n; //prime
    }
}
