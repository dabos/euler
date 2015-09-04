package euler;

import java.math.BigInteger;

/**
 * @author alexandrubostan
 * @since 25.06.2015
 */
public class P14 {
    static int limit = 1_000_000;
    static BigInteger cacheSize = BigInteger.valueOf(limit);

    public static void main(String[] args) {
        int maxArg = -1;
        int maxChain = 0;
        for (int i = 1; i < limit; i++) {
            int chainLen = collatzChainLength(BigInteger.valueOf(i));
            if (chainLen > maxChain) {
                maxArg = i;
                maxChain = chainLen;
            }
        }
        System.out.println(maxArg);
    }

    private static int[] collatzChainLength = new int[limit];

    private static int collatzChainLength(BigInteger n) {
        if(n.signum() < 0)
            throw  new IllegalArgumentException();
        if (n.compareTo(cacheSize) >= 0) {
            return computeNext(n);
        }

        int index = n.intValue();
        if (collatzChainLength[index] == 0) {
            collatzChainLength[index] = computeNext(n);
        }
        return collatzChainLength[index];
    }


    private static int computeNext(BigInteger n) {
        if (n.equals(BigInteger.ONE))
            return 1;
        else if (!n.testBit(0))
            return collatzChainLength(n.shiftRight(1)) + 1;
        else return collatzChainLength(n.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE)) + 1;
    }
}
