package euler;

/**
 * @author alexandrubostan
 * @since 27.06.2015
 */
public class P14_1 {
//    public static void main(String[] args) {
//        long largestStart = 13;
//        long longestChain = 10;
//        long[] cache = new long[1_000_000];
//
//        long target = 1_000_000;
//
//        for (long i = 1; i < target; i++) {
//            long number = i;
//            long chain = 0;
//            while (number != 1 && number >= i) {
//                chain++;
//                number = collatz(number);
//            }
//            chain += cache[number];
//            cache[number] = chain;
//            if (chain > longestChain) {
//                longestChain = chain;
//                largestStart = i;
//            }
//        }
//        System.out.println(largestStart);
//    }
//
//    private static long collatz(long n) {
//        if (n % 2 == 0) return n / 2;
//        else return (n * 3) + 1;
//    }
}
