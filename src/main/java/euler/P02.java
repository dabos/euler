package euler;

import eulerfm.Problem;

/**
 * Created by alexandrubostan on 06.08.2014.
 */
public class P02 extends Problem<Integer> {
    @Override
    public String getName() {
        return "Problem 2";
    }

    @Override
    public void run() {

        result = sumEvenFib();
    }

    private int sumEvenFib() {
        int sum = 0;
        for (int i = 0; ; i++) {
            int fib = fibonacci(i);
            if (fib > 4000000) break;
            if (fib % 2 == 0)
                sum += fib;
        }
        return sum;
    }

    private static int fibonacci(int x) {
        if (x < 0 || x > 46)
            throw new IllegalArgumentException();
        int a = 0;
        int b = 1;
        for (int i = 0; i < x; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }


    public static void main(String[] args) {
        int i = 1;
    }
}
